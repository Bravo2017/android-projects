package com.dismas.imaya.evrybit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by imaya on 4/19/16.
 */
public class GitModel {
//    @Expose
//    private String login;
//    @Expose
//    private Integer id;
//    @Expose
//    private String name;
//    @SerializedName("full_name")
//    @Expose
//    private String fullName;
//
//    @Expose
//    private Owner owner;

//    @Expose
//    private String resource_uri;
//    @Expose
//    private String email;
//    @Expose
//    private String created;
//
//    public String getResource_uri() {
//        return resource_uri;
//    }
//    public void setResource_uri(String login) {
//        this.resource_uri = resource_uri;
//    }
//    public String getCreated() {
//        return created;
//    }
//    public void setCreated(String login) {
//        this.created = created;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public void setEmail(String login) {
//        this.email = email;
//    }

//    public String getLogin() {
//        return login;
//    }
//    public void setLogin(String login) {
//        this.login = login;
//    }
//    public Integer getId() {
//        return id;
//    }
//    public void setId(Integer id) {
//        this.id = id;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getfullName() {
//        return fullName;
//    }
//    public void setfullName(String fullName) {
//        this.fullName = fullName;
//    }
//    public Owner getOwner() {
//        return owner;
//    }
//    public void setOwner(Owner owner) {
//        this.owner = owner;
//    }
//
//    @Override
//    public String toString() {
//        return ("Created: " + created + "\nEmail: " + email + "\nResource URI: " + resource_uri);
//    }




        @SerializedName("username")
        @Expose
        private String username;
        @SerializedName("_id")
        @Expose
        private String Id;
        @SerializedName("last_login")
        @Expose
        private String lastLogin;
        @SerializedName("resource_uri")
        @Expose
        private String resourceUri;
        @SerializedName("created")
        @Expose
        private String created;
        @SerializedName("blocked_user")
        @Expose
        private Boolean blockedUser;
        @SerializedName("password")
        @Expose
        private String password;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("session_id")
        @Expose
        private String sessionId;
        @SerializedName("blocked_date")
        @Expose
        private String blockedDate;

        /**
         *
         * @return
         * The username
         */
        public String getUsername() {
            return username;
        }

        /**
         *
         * @param username
         * The username
         */
        public void setUsername(String username) {
            this.username = username;
        }

        /**
         *
         * @return
         * The Id
         */
        public String getId() {
            return Id;
        }

        /**
         *
         * @param Id
         * The _id
         */
        public void setId(String Id) {
            this.Id = Id;
        }

        /**
         *
         * @return
         * The lastLogin
         */
        public String getLastLogin() {
            return lastLogin;
        }

        /**
         *
         * @param lastLogin
         * The last_login
         */
        public void setLastLogin(String lastLogin) {
            this.lastLogin = lastLogin;
        }

        /**
         *
         * @return
         * The resourceUri
         */
        public String getResourceUri() {
            return resourceUri;
        }

        /**
         *
         * @param resourceUri
         * The resource_uri
         */
        public void setResourceUri(String resourceUri) {
            this.resourceUri = resourceUri;
        }

        /**
         *
         * @return
         * The created
         */
        public String getCreated() {
            return created;
        }

        /**
         *
         * @param created
         * The created
         */
        public void setCreated(String created) {
            this.created = created;
        }

        /**
         *
         * @return
         * The blockedUser
         */
        public Boolean getBlockedUser() {
            return blockedUser;
        }

        /**
         *
         * @param blockedUser
         * The blocked_user
         */
        public void setBlockedUser(Boolean blockedUser) {
            this.blockedUser = blockedUser;
        }

        /**
         *
         * @return
         * The password
         */
        public String getPassword() {
            return password;
        }

        /**
         *
         * @param password
         * The password
         */
        public void setPassword(String password) {
            this.password = password;
        }

        /**
         *
         * @return
         * The email
         */
        public String getEmail() {
            return email;
        }

        /**
         *
         * @param email
         * The email
         */
        public void setEmail(String email) {
            this.email = email;
        }

        /**
         *
         * @return
         * The sessionId
         */
        public String getSessionId() {
            return sessionId;
        }

        /**
         *
         * @param sessionId
         * The session_id
         */
        public void setSessionId(String sessionId) {
            this.sessionId = sessionId;
        }

        /**
         *
         * @return
         * The blockedDate
         */
        public String getBlockedDate() {
            return blockedDate;
        }

        /**
         *
         * @param blockedDate
         * The blocked_date
         */
        public void setBlockedDate(String blockedDate) {
            this.blockedDate = blockedDate;
        }



}
