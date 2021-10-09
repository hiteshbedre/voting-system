/**
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0.
 */

#include <aws/customer-profiles/model/FieldSourceProfileIds.h>
#include <aws/core/utils/json/JsonSerializer.h>

#include <utility>

using namespace Aws::Utils::Json;
using namespace Aws::Utils;

namespace Aws
{
namespace CustomerProfiles
{
namespace Model
{

FieldSourceProfileIds::FieldSourceProfileIds() : 
    m_accountNumberHasBeenSet(false),
    m_additionalInformationHasBeenSet(false),
    m_partyTypeHasBeenSet(false),
    m_businessNameHasBeenSet(false),
    m_firstNameHasBeenSet(false),
    m_middleNameHasBeenSet(false),
    m_lastNameHasBeenSet(false),
    m_birthDateHasBeenSet(false),
    m_genderHasBeenSet(false),
    m_phoneNumberHasBeenSet(false),
    m_mobilePhoneNumberHasBeenSet(false),
    m_homePhoneNumberHasBeenSet(false),
    m_businessPhoneNumberHasBeenSet(false),
    m_emailAddressHasBeenSet(false),
    m_personalEmailAddressHasBeenSet(false),
    m_businessEmailAddressHasBeenSet(false),
    m_addressHasBeenSet(false),
    m_shippingAddressHasBeenSet(false),
    m_mailingAddressHasBeenSet(false),
    m_billingAddressHasBeenSet(false),
    m_attributesHasBeenSet(false)
{
}

FieldSourceProfileIds::FieldSourceProfileIds(JsonView jsonValue) : 
    m_accountNumberHasBeenSet(false),
    m_additionalInformationHasBeenSet(false),
    m_partyTypeHasBeenSet(false),
    m_businessNameHasBeenSet(false),
    m_firstNameHasBeenSet(false),
    m_middleNameHasBeenSet(false),
    m_lastNameHasBeenSet(false),
    m_birthDateHasBeenSet(false),
    m_genderHasBeenSet(false),
    m_phoneNumberHasBeenSet(false),
    m_mobilePhoneNumberHasBeenSet(false),
    m_homePhoneNumberHasBeenSet(false),
    m_businessPhoneNumberHasBeenSet(false),
    m_emailAddressHasBeenSet(false),
    m_personalEmailAddressHasBeenSet(false),
    m_businessEmailAddressHasBeenSet(false),
    m_addressHasBeenSet(false),
    m_shippingAddressHasBeenSet(false),
    m_mailingAddressHasBeenSet(false),
    m_billingAddressHasBeenSet(false),
    m_attributesHasBeenSet(false)
{
  *this = jsonValue;
}

FieldSourceProfileIds& FieldSourceProfileIds::operator =(JsonView jsonValue)
{
  if(jsonValue.ValueExists("AccountNumber"))
  {
    m_accountNumber = jsonValue.GetString("AccountNumber");

    m_accountNumberHasBeenSet = true;
  }

  if(jsonValue.ValueExists("AdditionalInformation"))
  {
    m_additionalInformation = jsonValue.GetString("AdditionalInformation");

    m_additionalInformationHasBeenSet = true;
  }

  if(jsonValue.ValueExists("PartyType"))
  {
    m_partyType = jsonValue.GetString("PartyType");

    m_partyTypeHasBeenSet = true;
  }

  if(jsonValue.ValueExists("BusinessName"))
  {
    m_businessName = jsonValue.GetString("BusinessName");

    m_businessNameHasBeenSet = true;
  }

  if(jsonValue.ValueExists("FirstName"))
  {
    m_firstName = jsonValue.GetString("FirstName");

    m_firstNameHasBeenSet = true;
  }

  if(jsonValue.ValueExists("MiddleName"))
  {
    m_middleName = jsonValue.GetString("MiddleName");

    m_middleNameHasBeenSet = true;
  }

  if(jsonValue.ValueExists("LastName"))
  {
    m_lastName = jsonValue.GetString("LastName");

    m_lastNameHasBeenSet = true;
  }

  if(jsonValue.ValueExists("BirthDate"))
  {
    m_birthDate = jsonValue.GetString("BirthDate");

    m_birthDateHasBeenSet = true;
  }

  if(jsonValue.ValueExists("Gender"))
  {
    m_gender = jsonValue.GetString("Gender");

    m_genderHasBeenSet = true;
  }

  if(jsonValue.ValueExists("PhoneNumber"))
  {
    m_phoneNumber = jsonValue.GetString("PhoneNumber");

    m_phoneNumberHasBeenSet = true;
  }

  if(jsonValue.ValueExists("MobilePhoneNumber"))
  {
    m_mobilePhoneNumber = jsonValue.GetString("MobilePhoneNumber");

    m_mobilePhoneNumberHasBeenSet = true;
  }

  if(jsonValue.ValueExists("HomePhoneNumber"))
  {
    m_homePhoneNumber = jsonValue.GetString("HomePhoneNumber");

    m_homePhoneNumberHasBeenSet = true;
  }

  if(jsonValue.ValueExists("BusinessPhoneNumber"))
  {
    m_businessPhoneNumber = jsonValue.GetString("BusinessPhoneNumber");

    m_businessPhoneNumberHasBeenSet = true;
  }

  if(jsonValue.ValueExists("EmailAddress"))
  {
    m_emailAddress = jsonValue.GetString("EmailAddress");

    m_emailAddressHasBeenSet = true;
  }

  if(jsonValue.ValueExists("PersonalEmailAddress"))
  {
    m_personalEmailAddress = jsonValue.GetString("PersonalEmailAddress");

    m_personalEmailAddressHasBeenSet = true;
  }

  if(jsonValue.ValueExists("BusinessEmailAddress"))
  {
    m_businessEmailAddress = jsonValue.GetString("BusinessEmailAddress");

    m_businessEmailAddressHasBeenSet = true;
  }

  if(jsonValue.ValueExists("Address"))
  {
    m_address = jsonValue.GetString("Address");

    m_addressHasBeenSet = true;
  }

  if(jsonValue.ValueExists("ShippingAddress"))
  {
    m_shippingAddress = jsonValue.GetString("ShippingAddress");

    m_shippingAddressHasBeenSet = true;
  }

  if(jsonValue.ValueExists("MailingAddress"))
  {
    m_mailingAddress = jsonValue.GetString("MailingAddress");

    m_mailingAddressHasBeenSet = true;
  }

  if(jsonValue.ValueExists("BillingAddress"))
  {
    m_billingAddress = jsonValue.GetString("BillingAddress");

    m_billingAddressHasBeenSet = true;
  }

  if(jsonValue.ValueExists("Attributes"))
  {
    Aws::Map<Aws::String, JsonView> attributesJsonMap = jsonValue.GetObject("Attributes").GetAllObjects();
    for(auto& attributesItem : attributesJsonMap)
    {
      m_attributes[attributesItem.first] = attributesItem.second.AsString();
    }
    m_attributesHasBeenSet = true;
  }

  return *this;
}

JsonValue FieldSourceProfileIds::Jsonize() const
{
  JsonValue payload;

  if(m_accountNumberHasBeenSet)
  {
   payload.WithString("AccountNumber", m_accountNumber);

  }

  if(m_additionalInformationHasBeenSet)
  {
   payload.WithString("AdditionalInformation", m_additionalInformation);

  }

  if(m_partyTypeHasBeenSet)
  {
   payload.WithString("PartyType", m_partyType);

  }

  if(m_businessNameHasBeenSet)
  {
   payload.WithString("BusinessName", m_businessName);

  }

  if(m_firstNameHasBeenSet)
  {
   payload.WithString("FirstName", m_firstName);

  }

  if(m_middleNameHasBeenSet)
  {
   payload.WithString("MiddleName", m_middleName);

  }

  if(m_lastNameHasBeenSet)
  {
   payload.WithString("LastName", m_lastName);

  }

  if(m_birthDateHasBeenSet)
  {
   payload.WithString("BirthDate", m_birthDate);

  }

  if(m_genderHasBeenSet)
  {
   payload.WithString("Gender", m_gender);

  }

  if(m_phoneNumberHasBeenSet)
  {
   payload.WithString("PhoneNumber", m_phoneNumber);

  }

  if(m_mobilePhoneNumberHasBeenSet)
  {
   payload.WithString("MobilePhoneNumber", m_mobilePhoneNumber);

  }

  if(m_homePhoneNumberHasBeenSet)
  {
   payload.WithString("HomePhoneNumber", m_homePhoneNumber);

  }

  if(m_businessPhoneNumberHasBeenSet)
  {
   payload.WithString("BusinessPhoneNumber", m_businessPhoneNumber);

  }

  if(m_emailAddressHasBeenSet)
  {
   payload.WithString("EmailAddress", m_emailAddress);

  }

  if(m_personalEmailAddressHasBeenSet)
  {
   payload.WithString("PersonalEmailAddress", m_personalEmailAddress);

  }

  if(m_businessEmailAddressHasBeenSet)
  {
   payload.WithString("BusinessEmailAddress", m_businessEmailAddress);

  }

  if(m_addressHasBeenSet)
  {
   payload.WithString("Address", m_address);

  }

  if(m_shippingAddressHasBeenSet)
  {
   payload.WithString("ShippingAddress", m_shippingAddress);

  }

  if(m_mailingAddressHasBeenSet)
  {
   payload.WithString("MailingAddress", m_mailingAddress);

  }

  if(m_billingAddressHasBeenSet)
  {
   payload.WithString("BillingAddress", m_billingAddress);

  }

  if(m_attributesHasBeenSet)
  {
   JsonValue attributesJsonMap;
   for(auto& attributesItem : m_attributes)
   {
     attributesJsonMap.WithString(attributesItem.first, attributesItem.second);
   }
   payload.WithObject("Attributes", std::move(attributesJsonMap));

  }

  return payload;
}

} // namespace Model
} // namespace CustomerProfiles
} // namespace Awspackage voting.system;

  /**
   * Creates a new multipart POST HTTP request for a specified URL string
   *
   * @param urlString the string representation of the URL to send request to
   * @throws IOException
   */
  public ClientHttpRequest(String urlString) throws IOException {
    this(new URL(urlString));
  }


  private void postCookies() {
    StringBuffer cookieList = new StringBuffer();

    for (Iterator i = cookies.entrySet().iterator(); i.hasNext();) {
      Map.Entry entry = (Map.Entry)(i.next());
      cookieList.append(entry.getKey().toString() + "=" + entry.getValue());

      if (i.hasNext()) {
        cookieList.append("; ");
      }
    }
    if (cookieList.length() > 0) {
      connection.setRequestProperty("Cookie", cookieList.toString());
    }
  }

  /**
   * adds a cookie to the requst
   * @param name cookie name
   * @param value cookie value
   * @throws IOException
   */
  public void setCookie(String name, String value) throws IOException {
    cookies.put(name, value);
  }

  /**
   * adds cookies to the request
   * @param cookies the cookie "name-to-value" map
   * @throws IOException
   */
  public void setCookies(Map cookies) throws IOException {
    if (cookies == null) return;
    this.cookies.putAll(cookies);
  }

  /**
   * adds cookies to the request
   * @param cookies array of cookie names and values (cookies[2*i] is a name, cookies[2*i + 1] is a value)
   * @throws IOException
   */
  public void setCookies(String[] cookies) throws IOException {
    if (cookies == null) return;
    for (i
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
 */


migrations.RemoveField(
            model_name='patientregistration',
            name='aadhar_no',
        ),
        migrations.AlterField(
            model_name='facilityrelatedsummary',


import java.rmi.server.*;
import java.rmi.RemoteException;
import java.sql.Connection;

import java.util.Set;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class VotingSystem extends UnicastRemoteObject implements VotingInterface{

    public VotingSystem() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

    private User extractUserFromResultSet(ResultSet rs) throws SQLException {
        User user = new User();
        user.setId( rs.getInt("user_id") );
        user.setEmail(rs.getString("email"));
        user.setAge( rs.getInt("age") );
        user.setUsername( rs.getString("username") );
        user.setPass( rs.getString("password") );

        return user;
    }
    

    @Override
    public User getUser(int id) throws RemoteException{
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Users WHERE user_id=" + id);
            if(rs.next())
            {
                return extractUserFromResultSet(rs);
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    @Override
    public Set<User> getAllUsers() {
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Users");
            Set users = new HashSet();
            while(rs.next())
            {
                User user = extractUserFromResultSet(rs);
                users.add(user);
                System.out.println(user);
            }
            return users;
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public User getUserByUserNameAndPassword(String user, String pass) {
        Connection connection = ConnectionFactory.getConnection();

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM Users WHERE username=? AND password=?");
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                return extractUserFromResultSet(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean insertUser(User user) throws RemoteException{
        Connection connection = ConnectionFactory.getConnection();

        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO Users VALUES (NULL, ?, ?, ?, ?)");
            ps.setString(1, user.getEmail());
            ps.setInt(2, user.getAge());
            ps.setString(3, user.getUsername());
            ps.setString(4, user.getPass());
            int i = ps.executeUpdate();
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
        ex.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean updateUser(User user) throws RemoteException {
         Connection connection = ConnectionFactory.getConnection();
         try {
            PreparedStatement ps = connection.prepareStatement("UPDATE Users SET email=?, age=?, username=?, password=? WHERE user_id=?");
            ps.setString(1, user.getEmail());
            ps.setInt(2, user.getAge());
            ps.setString(3, user.getUsername());
            ps.setString(4, user.getPass());
            ps.setInt(5, user.getId());
            int i = ps.executeUpdate();
            if(i == 1) {
                return true;
            }
         } catch (SQLException ex) {
            ex.printStackTrace();
         }

         return false;
    }

    @Override
    public boolean deleteUser(int id) throws RemoteException {
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM Users WHERE user_id=" + id);
            if(i == 1) {
                return true;
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
        }
    
    private Competitor extractCompetitorFromResultSet(ResultSet rs) throws SQLException {
        Competitor competitor = new Competitor();
        competitor.setId( rs.getInt("competitor_id") );
        competitor.setName(rs.getString("name"));
        competitor.setAge( rs.getInt("age") );
        competitor.setJob(rs.getString("job") );
        competitor.setDetail(rs.getString("detail") );
        competitor.setCount(rs.getInt("count") );
        competitor.setElectionId(rs.getInt("election_id"));
        

        return competitor;
    }
    
    

    @Override
    public Competitor getCompetitor(int id) throws RemoteException {
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Competitors WHERE competitor_id=" + id);
            if(rs.next())
            {
                return extractCompetitorFromResultSet(rs);
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
        
    }
    
    @Override
    public Set<Competitor> getCompetitorsByElectionID(int id) throws RemoteException {
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Competitors WHERE election_id=" + id);
            Set competitors = new HashSet();
            while(rs.next())
            {
                Competitor competitor = extractCompetitorFromResultSet(rs);
                competitors.add(competitor);
            }
            return competitors;
        }catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
        
    }

    @Override
    public Set<Competitor> getAllCompetitor() throws RemoteException {
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Competitors");
            Set competitors = new HashSet();
            while(rs.next())
            {
                Competitor competitor = extractCompetitorFromResultSet(rs);
                competitors.add(competitor);
            }
            return competitors;
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean insertCompetitor(Competitor competitor) throws RemoteException {
        Connection connection = ConnectionFactory.getConnection();

        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO Competitors VALUES (NULL, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, competitor.getName());
            ps.setInt(2, competitor.getAge());
            ps.setString(3, competitor.getJob());
            ps.setString(4, competitor.getDetail());
            ps.setInt(5, competitor.getCount());
            ps.setInt(6, competitor.getElectionId());
            
            int i = ps.executeUpdate();
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
        ex.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean updateCompetitor(Competitor competitor) throws RemoteException {
         Connection connection = ConnectionFactory.getConnection();
         try {
            PreparedStatement ps = connection.prepareStatement("UPDATE Competitors SET name=?, age=?, job=?, detail=?, count=?, election_id=? WHERE competitor_id=?");
            ps.setString(1, competitor.getName());
            ps.setInt(2, competitor.getAge());
            ps.setString(3, competitor.getJob());
            ps.setString(4, competitor.getDetail());
            ps.setInt(5, competitor.getCount());
            ps.setInt(6, competitor.getElectionId());
            ps.setInt(7, competitor.getId());
            
            int i = ps.executeUpdate();
            if(i == 1) {
                return true;
            }
         } catch (SQLException ex) {
            ex.printStackTrace();
         }

         return false;
    }

    @Override
    public boolean deleteCompetitor(int id) throws RemoteException {
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM Competitors WHERE competitor_id=" + id);
            if(i == 1) {
                return true;
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return false;
    }
    
    private Election extractElectionFromResultSet(ResultSet rs) throws SQLException {
        Election election= new Election();
        election.setId( rs.getInt("election_id") );
        election.setName(rs.getString("name"));
        election.setType(rs.getString("type") );
        election.setDetail(rs.getString("detail") );
        election.setStatus(rs.getBoolean("status") );
        election.setResult(rs.getString("result") );
        System.out.print(rs.getString("result") );
        
        

        return election;
    }

    @Override
    public Election getElection(int id) throws RemoteException {
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Elections WHERE election_id=" + id);
            if(rs.next())
            {
//                System.out.print(extractElectionFromResultSet(rs).getName());
                return extractElectionFromResultSet(rs);
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    @Override
    public Set<Election> getAllElection() throws RemoteException {
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Elections");
            Set elections = new HashSet();
            while(rs.next())
            {
                Election election = extractElectionFromResultSet(rs);
                elections.add(election);
            }
            return elections;
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean insertElection(Election election) throws RemoteException {
        Connection connection = ConnectionFactory.getConnection();

        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO Elections VALUES (NULL, ?, ?, ?, ?, ?)");
            ps.setString(1, election.getName());
            ps.setString(2, election.getType());
            ps.setString(3, election.getDetail());
            ps.setBoolean(4, election.getStatus());
            ps.setString(5, election.getResult());
            
            int i = ps.executeUpdate();
            if(i == 1) {
                return true;
            }
        } catch (SQLException ex) {
        ex.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean updateElection(Election election) throws RemoteException {
        Connection connection = ConnectionFactory.getConnection();
         try {
            PreparedStatement ps = connection.prepareStatement("UPDATE Elections SET name=?, type=?, detail=?, status=?, result=? WHERE election_id=?");
            ps.setString(1, election.getName());
            ps.setString(2, election.getType());
            ps.setString(3, election.getDetail());
            ps.setBoolean(4, election.getStatus());
            ps.setString(5, election.getResult());
            ps.setInt(5, election.getId());
            
            int i = ps.executeUpdate();
            if(i == 1) {
                return true;
            }
         } catch (SQLException ex) {
            ex.printStackTrace();
         }

         return false;
    }

    @Override
    public boolean deleteElection(int id) throws RemoteException {
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM Elections WHERE election_id=" + id);
            if(i == 1) {
                return true;
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return false;
    }
    
}


