
import java.io.IOException;
 
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;


public class TestHbase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		byte[] bs = Bytes.toBytes("aa");
		
		bs[ bs.length-1] ++;
		
		for(byte b: bs)
		{
			System.out.print(b);
			System.out.println("   ");
			System.out.println( Integer.toHexString(b));
			
		}

	}

}
