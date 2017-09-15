package com.mkalaimalai.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by kalaimam on 7/14/17.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "USER")
public class User {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id()
    private String id;


    private String userName;


    private String email;


    private String password;


    private String firstName;


    private String lastName;


    private String middleName;

    /* if username is not set, use email as user name*/
    public void setUserName(String userName){
        if (userName == null)
            this.userName = this.email;
    }


    private List<Address> addresses;


}
