package by.itacademy.psekha.api;

import by.itacademy.psekha.base.Base;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiPage extends Base {
    public static final String DEFACTO_URL = BASE_URL + "/ru-kz";

    public static Response getDoSite() {
        String URL = DEFACTO_URL;
        Response response = given()
                .when()
                .get(URL);
        return response;
    }

    public static Response postDoLogin() {
        String URL = DEFACTO_URL + "/login/login";
        Response response = given()
                .params(getParams())
                .when()
                .post(URL);
        return response;
    }

    public static Response postDoAddCart() {
        String URL = DEFACTO_URL + "/customer/addtocart";
        Response response = given()
                .params(getDoParams())
                .when()
                .post(URL);
        return response;
    }

    public static Response postDoAddCart1() {
        String URL = DEFACTO_URL + "/customer/addtocart";
        Response response = given()
                .cookie("_df_smid=cc7961ea-6c66-4617-a15f-fb337451d7da;" +
                        " SelectedGender=L21hbg%253D%253D; CustomerEmail=john%40gmail.com;" +
                        " _vwo_uuid_v2=DDA0A0943CF0DE5A086A0E9F7942ABE9A|439ea1e5ae36fe414a4aba85d54e781d;" +
                        " _vwo_uuid=DDA0A0943CF0DE5A086A0E9F7942ABE9A; _vwo_ds=3%241739694895%3A89.41191462%3A%3A;" +
                        " _gcl_au=1.1.2116561846.1739694905; _ga=GA1.1.1522464842.1739694906;" +
                        " _fbp=fb.1.1739694905615.95901586298715802; " +
                        "_ga_KPHXGRQCQ1=GS1.1.1739694905.1.0.1739694909.56.1.1332638371;" +
                        " SelectedGenderValue=MjQ0OA%253D%253D; _ym_uid=1740659286811504340;" +
                        " _ym_d=1740659286; DF.l145=cFFg7QN6UVqjAbRmGmL2vmhrs0vGmGG7%2Fhx5V7d" +
                        "jprGFQDl%2BLl6xPgAgEf9F9j9bvex1p9loTZ8w0fQDSVcjXDgwCC%2FFEz73WBmhi6x35z" +
                        "am830bOsaNE8iV6WynRkuK0Z%2BiTindOPoxeaddREstRdAbDPpjIdZaMgEIYSPWt5ZL5a66T" +
                        "StNUKKQu0zVQEfveakBoMt4zKo%2FRxRWlJoa%2BRw8g%2FgZNE7BXSGpzaAR3rmh6zXyrocuze19qvRx2AlcpmBpun%2B93jZmOcEnd0SzM%2BdJA9oTDt9lRoZz2Th1YvQapMSFGK6OPWX7XDHJPu0B; currentculture=ru-ua; " +
                        "utmCampaign5d=admitad; utmSource5d=admitad; utmMedium5d=cpa;" +
                        " _ga_99S8D4PKL3=GS1.1.1740828041.1.1.1740828066.35.1.1341830328;" +
                        " _ga_1234567890=GS1.1.1740828041.2.1.1740828067.0.0.19690432; " +
                        "_vis_opt_s=9%7C; _vis_opt_test_cookie=1; SelectedMenuItem=L3J1LWt6L21hbg%253D%253D;" +
                        " plv=3212349; _vwo_sn=1217016%3A3%3A%3A%3A1; " +
                        "lastVisitedProducts=%255B%2522D6242AX25SPBK27%2522%252C%2522D5568AX25SPWT" +
                        "34%2522%252C%2522C1293AX25SPGN1214%2522%252C%2522D8713AX25SPAR15%2522%252C%2" +
                        "522D8713AX25SPAR15%2522%252C%2522D8713AX25SPAR15%2522%252C%2522D8713AX25SPKH4" +
                        "92%2522%252C%2522D6976AX25SPNM55%2522%252C%2522C1293AX25SPGN1214%2522%255D;" +
                        " PageNumber=3; _ga_123456789124A=GS1.1.1740911916.20.1.1740911958.0.0.333132216;" +
                        " _ga_9BFN83FBEN=GS1.1.1740911916.21.1.1740911958.18.1.644355745; miniCartCount=1" +
                        "; DF.Customer.V3=b7a5a5d8-16e6-434a-a8ff-969f122801f6")
                .param("productVariantMatrixId", "bcdfab6a-82f0-45bd-a919-411ea27e1752")
                .param("quantity", "1")
                .when()
                .post(URL);
        return response;
    }

    private static Map<String, Object> getParams() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("LoginModel.Email", "john@gmail.com");
        params.put("LoginModel.Password", "455555555");
        params.put("ReturnUrl", "/ru-kz/search");
        return params;
    }

    private static Map<String, Object> getDoParams() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("productVariantMatrixId", "9b3a13ca-7626-49dc-96a1-7f925676f69e");
        params.put("quantity", "1");
        params.put("productVariantMatrixId", "3213555");
        return params;
    }
}