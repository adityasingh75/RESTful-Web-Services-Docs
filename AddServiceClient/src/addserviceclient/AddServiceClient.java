/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addserviceclient;
/**
 *
 * @author AD20104717
 */
public class AddServiceClient {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sum=addTwoNumber(30,40);
        System.out.println(sum);
    }
    private static String addTwoNumber(int num1, int num2) {
        com.wipro.AddService_Service service = new com.wipro.AddService_Service();
        com.wipro.AddService port = service.getAddServicePort();
        return port.addTwoNumber(num1, num2);
    }
}
