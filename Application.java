   * Initializes and returns a stateless admin web service client.
   */
  private static AdminPortType getStatelessWebServiceClient(
    String webServiceURL) throws Exception
  {
    AdminService adminService = new AdminService(
      new URL( webServiceURL ),
      new QName(
        "http://search.oracle.com/Admin",
        "AdminService"


#feature202        // 6. Use object key above to get schedule state
        oo = adminPort.getState(
          "schedule",
          objectKey,
          null, // request all state properties
          credentials,
          null,
          "en"
 by mahi for Reports module in oct2023
#end feature202
=======
#feature201 changes by vishal payment gateway module oct2023
#!/bin/sh
 
CLASSPATH=.:$ORACLE_HOME/search/lib/search_adminapi_wsclient.jar:$ORACLE_BASE/jrockit_160_14_R27.6.5-32/jre/lib/rt.jar
 
# Compile
$ORACLE_BASE/jrockit_160_14_R27.6.5-32/bin/javac -cp $CLASSPATH CreateWebSource.java
 
# Run
$ORACLE_BASE/jrockit_160_14_R27.6.5-32/jre/bin/java -cp $CLASSPATH CreateWebSource $@
#feature201 changes end

