# Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
# SPDX-License-Identifier: MIT-0

import datagenerator
import json
import requests
import yaml

# Amplitude event support
# This follows the Amplitude V2 HTTP Bulk API spec, here:
# https://help.amplitude.com/hc/en-us/articles/360032842391-HTTP-API-V2
#
# These classes accept a user, platform, and general event properties and map them 
# into an Amplitude API compatible represenation.

class AmplitudeEvent:
  def __init__(self, timestamp, user, platform):
    self.time = int(timestamp.timestamp() * 1000) # Amplitude time is milliseconds since epoch
    self.user_id = f'{user.id:0>5}'  # Amplitude user ID is a string type, min length is 5 which is weird

    platform_data = user.get_platform_data(platform)
    self.device_id = platform_data['anonymous_id']
    if platform == 'ios':
        self.idfa = platform_data['advertising_id']
        self.platform = 'iOS'
        self.device_model = platform_data['model']
        self.os_version = platform_data['version']
    elif platform == 'android':
        self.adid = platform_data['advertising_id']
        self.device_model = platform_data['model']
        self.os_version = platform_data['version']

  def toJson(self):
        return self.__repr__()

  def __repr__(self):
    return json.dumps(self.__dict__)

class AmplitudeIdentifyEvent(AmplitudeEvent):
  def __init__(self, timestamp, user, platform):
    super().__init__(timestamp, user, platform)
    self.event_type = '$identify'
    self.user_properties = user.traits
    self.user_properties['name'] = user.name
    self.user_properties['email'] = user.email
    self.user_properties['age'] = user.age
    self.user_properties['gender'] = user.gender
    self.user_properties['persona'] = user.persona
    self.user_properties['username'] = user.username

class AmplitudeTrackEvent(AmplitudeEvent):
  def __init__(self, name, timestamp, user, platform, properties):
    super().__init__(timestamp, user, platform)
    self.event_type = name
    self.event_properties = properties

class AmplitudeSender:
  def __init__(self, config):
    self.config = config # MUST BE:  { 'api_key': <Amplitude API Key> }
    self.endpoint = 'https://api.amplitude.com/2/httpapi'

  def send_batch(self, platform, events, debug=False):
    batch_events = {
      "api_key": self.config['api_key'],
      "events": events
    }

    events_str = json.dumps(batch_events, default=lambda x: x.__dict__) 
    #print(f'Batch length bytes: {len(events_str)}')
    if debug:
      parsed = json.loads(events_str)
      print(f'{json.dumps(parsed, indent=4)}')
      response = None
    else:
      response = requests.post(self.endpoint, 
        data=events_str)
      #print(self.config_keys[platform])
      #print(json.dumps(batch_events, default=lambda x: x.__dict__))
      #print(f'Sent {len(batch_events["batch"])} events and got {response}')
    return response
    package linodego

import "context"

// Account associated with the token in use
type Account struct {
	FirstName  string      `json:"first_name"`
	LastName   string      `json:"last_name"`
	Email      string      `json:"email"`
	Company    string      `json:"company"`
	Address1   string      `json:"address_1"`
	Address2   string      `json:"address_2"`
	Balance    float32     `json:"balance"`
	City       string      `json:"city"`
	State      string      `json:"state"`
	Zip        string      `json:"zip"`
	Country    string      `json:"country"`
	TaxID      string      `json:"tax_id"`
	Phone      string      `json:"phone"`
	CreditCard *CreditCard `json:"credit_card"`
}

// CreditCard information associated with the Account.
type CreditCard struct {
	LastFour string `json:"last_four"`
	Expiry   string `json:"expiry"`
}

// fixDates converts JSON timestamps to Go time.Time values
func (v *Account) fixDates() *Account {
	return v
}

// GetAccount gets the contact and billing information related to the Account
func (c *Client) GetAccount(ctx context.Context) (*Account, error) {
	e, err := c.Account.Endpoint()
	if err != nil {
		return nil, err
	}
	r, err := coupleAPIErrors(c.R(ctx).SetResult(&Account{}).Get(e))
	if err != nil {
		return nil, err
	}
	return r.Result().(*Account).fixDates(), nil
}
<!-- You can turn off the Compile on Save (or Deploy on Save) setting -->
<!-- in the project's Project Properties dialog box.-->
<project name="voting-system" default="default" basedir=".">
    <description>Builds, tests, and runs the project voting-system.</description>
    <import file="nbproject/build-impl.xml"/>
    <!--

    There exist several targets which are by default empty and which can be 
    used for execution of your tasks. These targets are usually executed 
    before and after some main targets. They are: 

      -pre-init:                 called before initialization of project properties
      -post-init:                called after initialization of project properties
      -pre-compile:              called before javac compilation
      -post-compile:             called after javac compilation
      -pre-compile-single:       called before javac compilation of single file
      -post-compile-single:      called after javac compilation of single file
      -pre-compile-test:         called before javac compilation of JUnit tests
      -post-compile-test:        called after javac compilation of JUnit tests
      -pre-compile-test-single:  called before javac compilation of single JUnit test
      -post-compile-test-single: called after javac compilation of single JUunit test
      -pre-jar:                  called before JAR building
      -post-jar:                 called after JAR building
      -post-clean:               called after cleaning build products

    (Targets beginning with '-' are not intended to be called on their own.)

    Example of inserting an obfuscator after compilation could look like this:

        <target name="-post-compile">
            <obfuscate>
                <fileset dir="${build.classes.dir}"/>
            </obfuscate>
        </target>

    For list of available properties check the imported 
    nbproject/build-impl.xml file. 


    Another way to customize the build is by overriding existing main targets.
    The targets of interest are: 

      -init-macrodef-javac:     defines macro for javac compilation
      -init-macrodef-junit:     defines macro for junit execution
      -init-macrodef-debug:     defines macro for class debugging
      -init-macrodef-java:      defines macro for class execution
      -do-jar:                  JAR building
      run:                      execution of project 
      -javadoc-build:           Javadoc generation
      test-report:              JUnit report generation

    An example of overriding the target for project execution could look like this:

        <target name="run" depends="voting-system-impl.jar">
            <exec dir="bin" executable="launcher.exe">
                <arg file="${dist.jar}"/>
            </exec>
        </target>

    Notice that the overridden target depends on the jar target and not only on 
    the compile target as the regular run target does. Again, for a list of available 
    properties which you can use, check the target you are overriding in the
    nbproject/build-impl.xml file. 
