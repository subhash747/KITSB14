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