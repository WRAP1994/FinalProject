package pages;

import helper.Endpoint;
import io.restassured.response.Response;

import java.util.List;

import static helper.Models.getListUsers;
import static org.assertj.core.api.Assertions.assertThat;


public class ApiPage {

    String setURL;

    Response res;

    public void prepareUrlFor(String url){
        switch (url) {
            case "GET_LIST_USERS":
                setURL = Endpoint.GET_LIST_USERS;
                break;
            case "CREATE_NEW_USERS":
                setURL = Endpoint.CREATE_NEW_USERS;
                break;
            case "UPDATE_USERS":
                setURL = Endpoint.UPDATE_USERS;
                break;
            case "DELETED_USERS":
                setURL = Endpoint.DELETED_USERS;
                break;
            default:
                System.out.println("input right url");
        }
        System.out.println("endpoint siap pakai adalah : "+setURL);

    }

    public void hitApiGetUserByID(){
        res = getListUsers(setURL);
    }

    public void validationStatusCodeIsEquals(int status_code){
        assertThat(res.statusCode()).isEqualTo(status_code);
    }

    public void validationResponseBodyGetUserByID(){
       List<Object> id = res.jsonPath().getList("id");
       assertThat(id.get(0)).isNotNull();

        System.out.println();


    }

    public void validationResponseJsonWithJSONSchema(){
        System.out.println("step from apistep ke5");
    }

}
