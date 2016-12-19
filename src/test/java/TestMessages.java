import com.mycila.xmltool.XMLDoc;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import org.junit.Test;

/**
 * Created by bournas on 12/12/16.
 */
public class TestMessages {

    final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();

    @Test
    public void testProtoPerformance() {
        MessageTypes.Location location = MessageTypes.Location.newBuilder()
                .setLng(-0.2).setLat(52).setAccuracy(1200.4).build();

        MessageTypes.Test1 test1 = MessageTypes.Test1.newBuilder()
                .setA(150).build();

        System.out.println(bytesToHex(location.toByteArray()));
        System.out.println(location.getSerializedSize());
    }

    @Test
    public void testJSONPerformance() {
        JsonObject jsonObject = new JsonObject().put("msg", "location").put("lat", 52.0).put("lng", -0.2).put("accuracy", 1200.4);

        Buffer buffer = Buffer.buffer();
        jsonObject.writeToBuffer(buffer);
        buffer.getBytes();

        System.out.println(jsonObject.encodePrettily());
        System.out.println(bytesToHex(jsonObject.toString().getBytes()));
        System.out.println(jsonObject.toString().getBytes().length);
    }

    @Test
    public void testXMLPerformance() {

        String xml = XMLDoc.newDocument(true)
                .addRoot("msg")
                .addTag("location")
                .addAttribute("lat", "52.0")
                .addAttribute("lng", "-0.2")
                .addAttribute("accuracy", "1200.4").toString();

        System.out.println(xml);
        System.out.println(bytesToHex(xml.getBytes()));
        System.out.println(xml.getBytes().length);
    }

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for ( int j = 0; j < bytes.length; j++ ) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
}
