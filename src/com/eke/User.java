package com.eke;

public class User {
    private final String name;
    private final String email;
    private final String address;
    private final int age;
    private final String nameOfMother;
    private final String mobilePhone;

    public User(Builder builder){
        this.name = builder.name;
        this.email = builder.email;
        this.address = builder.address;
        this.age = builder.age;
        this.nameOfMother = builder.nameOfMother;
        this.mobilePhone = builder.mobilePhone;
    }

    public static class Builder {

        private final String name;
        private final String email;
        private String address;
        private int age;
        private String nameOfMother;
        private String mobilePhone;

        public Builder(String name, String email){
            this.name = name;
            this.email = email;
        }

        public Builder setAddress(String address){
            this.address = address;
            return this;
        }

        public Builder setNameOfMother(String nameOfMother){
            this.nameOfMother = nameOfMother;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setMobilePhone(String mobilePhone){
            this.mobilePhone = mobilePhone;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name+"-"+this.address+"-"+this.email+"-"+this.age;
    }
}
