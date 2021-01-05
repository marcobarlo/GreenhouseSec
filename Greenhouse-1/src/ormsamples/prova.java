package ormsamples;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class prova {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		creaColt(3,6,6);
	}
	public static void creaColt(int sez, int colt, int id) {
	/*	URL url = new URL("https://localhost:8443/auth/realms/Greenhouse/authz/protection/resource_set");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		Map<String, String> parameters = new HashMap<>();
		parameters.put("param1", "val");
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("Authorization", "Bearer \"eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJMeERJMENSUV9tSzZXemFpWXc5eG1hMDBuUmhkZ0FESlVFSUF2c1RCYm9RIn0.eyJleHAiOjE2MDk4Njc1ODcsImlhdCI6MTYwOTg2NzI4NywianRpIjoiOTllODA2MWMtOTZhZi00YjVjLTg1ODYtODkwNTNiMTRkZWJjIiwiaXNzIjoiaHR0cHM6Ly9sb2NhbGhvc3Q6ODQ0My9hdXRoL3JlYWxtcy9HcmVlbmhvdXNlIiwiYXVkIjoiYWNjb3VudCIsInN1YiI6Ijg3OGUzYTY4LWU5NDEtNDNjNC1hZDg2LWQ5YWYxY2QyMGQ0ZCIsInR5cCI6IkJlYXJlciIsImF6cCI6IkdyZWVuaG91c2VDbGllbnQiLCJzZXNzaW9uX3N0YXRlIjoiNDhjOTBlMjMtODk0ZS00OGIwLTkwMjktOTVmYWIzOWQwZDFjIiwiYWNyIjoiMSIsInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJ1bWFfYXV0aG9yaXphdGlvbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7IkdyZWVuaG91c2VDbGllbnQiOnsicm9sZXMiOlsidW1hX3Byb3RlY3Rpb24iXX0sImFjY291bnQiOnsicm9sZXMiOlsidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJwcm9maWxlIGVtYWlsIiwiY2xpZW50SG9zdCI6IjE3Mi4yMi4wLjEiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsImNsaWVudElkIjoiR3JlZW5ob3VzZUNsaWVudCIsInByZWZlcnJlZF91c2VybmFtZSI6InNlcnZpY2UtYWNjb3VudC1ncmVlbmhvdXNlY2xpZW50IiwiY2xpZW50QWRkcmVzcyI6IjE3Mi4yMi4wLjEifQ.BZA28l-hvC-dzWMoaaNMnnwdXH0cX0xANihhWTLPYFqxopWv1mrPtyHfLwhYf-9oOi5xp9jpQ_v2MGK_Qby-4dPwNWdGvcC4ZLffsHy3nlmvNN6ZwO_ubWSd2arT-HDUXtqTvqv2YA1eEtWx9wRjC4x37FLnXkEnw0DQz7qIBQdk5xDcAdVkX2dl6mtUp421bBNkpMs0kXEgeja7OIA_e3rYD4M8QwTmlBzhzqxft-sk3JPHua9LYrodS6ZhCDfBCraFSlgKcILKY-vIsVqUgQeuzQkuIzI3nnjHutxMvA-0mysz9dJBcZlT0qNVkmobkhcXIMDLJw-Ady4MQRXbTw\"");
		con.setDoOutput(true);
		String query="{\"name\":\"Coltivazione8\",\"type\":\"Assets\",\"resource_scopes\":[\"coltivazione:view\"],\"owner\":\"barlo\",\"ownerManagedAccess\": true}";
		if (query != null) {
		con.setRequestProperty("Content-Length", Integer.toString(query.length()));
		con.getOutputStream().write(query.getBytes("UTF8"));
		}*/
		Properties systemProps = System.getProperties();
	    System.setProperty("javax.net.ssl.keyStore","D:\\greenhouseSSD\\keystores\\keystore"); 
	    System.setProperty("javax.net.ssl.keyStorePassword","password");
	    System.setProperty("javax.net.ssl.trustStore","D:\\greenhouseSSD\\keystores\\truststore"); 
	    System.setProperty("javax.net.ssl.trustStorePassword","password");
	    System.setProperties(systemProps);
		String query="{\"name\":\"Coltivazione"+id+"\",\"type\":\"Assets\",\"uri\":\"/sezione/"+sez+"/coltivazione/"+colt+"\",\"resource_scopes\":[\"coltivazione:view\",\"coltivazione:modify\"],\"owner\":\"ermanno\",\"ownerManagedAccess\": true}";
		 @SuppressWarnings("deprecation")
		HttpClient httpClient = new DefaultHttpClient();
		    HttpPost httpPost = new HttpPost("https://localhost:8443/auth/realms/Greenhouse/authz/protection/resource_set");
		    httpPost.setHeader("Content-type", "application/json");
		    
		    httpPost.setHeader("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJMeERJMENSUV9tSzZXemFpWXc5eG1hMDBuUmhkZ0FESlVFSUF2c1RCYm9RIn0.eyJleHAiOjE2MDk4Njk2NTksImlhdCI6MTYwOTg2OTM1OSwianRpIjoiMTkyODJiNDUtNGU4MC00MjAzLWEyYzctYjNiZDI4YzU1NTFlIiwiaXNzIjoiaHR0cHM6Ly9sb2NhbGhvc3Q6ODQ0My9hdXRoL3JlYWxtcy9HcmVlbmhvdXNlIiwiYXVkIjoiYWNjb3VudCIsInN1YiI6Ijg3OGUzYTY4LWU5NDEtNDNjNC1hZDg2LWQ5YWYxY2QyMGQ0ZCIsInR5cCI6IkJlYXJlciIsImF6cCI6IkdyZWVuaG91c2VDbGllbnQiLCJzZXNzaW9uX3N0YXRlIjoiZGU3NTY4NDItMTYxNS00MjhkLTlkMzMtYjdkZDg3YjYwYTgyIiwiYWNyIjoiMSIsInJlYWxtX2FjY2VzcyI6eyJyb2xlcyI6WyJ1bWFfYXV0aG9yaXphdGlvbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7IkdyZWVuaG91c2VDbGllbnQiOnsicm9sZXMiOlsidW1hX3Byb3RlY3Rpb24iXX0sImFjY291bnQiOnsicm9sZXMiOlsidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJwcm9maWxlIGVtYWlsIiwiY2xpZW50SG9zdCI6IjE3Mi4yMi4wLjEiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsImNsaWVudElkIjoiR3JlZW5ob3VzZUNsaWVudCIsInByZWZlcnJlZF91c2VybmFtZSI6InNlcnZpY2UtYWNjb3VudC1ncmVlbmhvdXNlY2xpZW50IiwiY2xpZW50QWRkcmVzcyI6IjE3Mi4yMi4wLjEifQ.HNkT9ZWCYB2qjsRxoIytjHOz6-h67mxuD5B9cR7DG7veDXUpmqjROBYsOiiOTNbuxm8dvmy_ZmRSr_TggUODM5XssPIQQqQqxAa53kZrmm92E2W_7kih175ARIslcBDZJqCcfd3SAYCHWDHc-706o48H1mbudSTPCq6I1YKxD3a4zXi35fTbzSMdJLC7-6O5eRPffsFJY7V6BWVQcxXTtx9nqhrnOsX-qSTw7wPJjj7fvl3qvcR0N9z-zspMs2jg2007RCwxPjs_Li5De4Sgs25er_QKp7avYqZJnqTKti-DkjT1xeo4DWcJDzAQrWdkAfQdO0WNC50Dii9u4ubbfQ");
		    try {
		        StringEntity stringEntity = new StringEntity(query);
		        httpPost.getRequestLine();
		        httpPost.setEntity(stringEntity);

		        httpClient.execute(httpPost);
		    } catch (Exception e) {
		        throw new RuntimeException(e);
		    }

	}

}
