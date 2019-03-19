import java.net.* ;
import java.io.* ;
import java.lang.* ;

class TcpJavaServer 
{
    public static void main(String args[]) throws IOException
    {
        String data="Your connection has reached us \n" ;
        ServerSocket srvr=new ServerSocket(9002) ;
        Socket skt=srvr.accept() ;
        System.out.println("Connection has been established from ip address of : " + skt.getInetAddress()+ "\n") ;
        PrintWriter out = new PrintWriter(skt.getOutputStream(), true) ;
        out.print(data) ;
        out.close() ;
        skt.close() ;
        srvr.close() ;
    }
}
