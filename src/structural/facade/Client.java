package structural.facade;

/**
 * Created by nitish.s on 07/07/19.
 */


/**

 Suppose we have an application with set of interfaces to use MySql/Oracle database and to generate different types of reports, such as HTML report, PDF report etc.
 So we will have different set of interfaces to work with different types of database.
 Now a client application can use these interfaces to get the required database connection and generate reports.
 But when the complexity increases or the interface behavior names are confusing, client application will find it difficult to manage it.
 So we can apply Facade design pattern here and provide a wrapper interface on top of the existing interface to help client application.

 Source : https://www.journaldev.com/1557/facade-design-pattern-in-java
*/

import java.sql.Connection;

public class Client {

    public static void main(String[] args) {
        String tableName="Employee";

        //generating MySql HTML report and Oracle PDF report without using Facade
        System.out.println("<=== Output Without Using Facade ===>");
        Connection con = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, con);

        Connection con1 = OracleHelper.getOracleDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, con1);

        System.out.println("<=== Output Using Facade ===>");
        //generating MySql HTML report and Oracle PDF report using Facade
        FacadeHelper.generateReport(FacadeHelper.DBTypes.MYSQL, FacadeHelper.ReportTypes.HTML, tableName);
        FacadeHelper.generateReport(FacadeHelper.DBTypes.ORACLE, FacadeHelper.ReportTypes.PDF, tableName);

    }
}
