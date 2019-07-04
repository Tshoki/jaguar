package com.internousdev.jaguar.dto;

public class DestinationInfoDTO {
private int id;
private String familyName;
private String firstName;
private String familyNameKana;
private String firstNameKana;
private String email;
private String telNumber;
private String userAddress;

public int setId(){
	return id;
}
public void getId(int id){
	this.id=id;
}

public String setFamilyName(){
	return familyName;
}
public void getFamilyName(String familyName){
	this.familyName=familyName;
}


public String setFirstName(){
	return firstName;
}
public void getFirstName(String firstName){
	this.firstName=firstName;
}


public String setFamilyNameKana(){
	return familyNameKana;
}
public void getFamilyNameKana(String familyNameKana){
	this.familyNameKana=familyNameKana;
}


public String setFirstNameKana(){
	return firstNameKana;
}
public void getFirstNameKana(String firstNameKana){
	this.firstNameKana=firstNameKana;
}


public String setEmail(){
	return email;
}
public void getEmail(String email){
	this.email=email;
}


public String setTelNumber(){
	return telNumber;
}
public void getTelNumber(String telNumber){
	this.telNumber=telNumber;
}


public String setUserAddress(){
	return userAddress;
}
public void getUserAddress(String userAddress){
	this.userAddress=userAddress;
}
}
