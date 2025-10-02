package com.ss.breg.model;

import jakarta.persistence.*;

@Entity
@Table(name = "register")   // maps this class to your "register" table
public class AllInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment column
    @Column(name = "id")
    private Long id;

    @Column(name = "fname", nullable = false, length = 50)
    private String fname;

    @Column(name = "mname", length = 50)
    private String mname;

    @Column(name = "lname", nullable = false, length = 50)
    private String lname;

    @Column(name = "gender", length = 10)
    private String gender;

    @Column(name = "address", length = 100)
    private String address;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "state", length = 50)
    private String state;

    @Column(name = "country", length = 50)
    private String country;

    @Column(name = "phno", length = 15)
    private String phno;

    @Column(name = "bname", length = 50)
    private String bname;

    @Column(name = "acnum", length = 20)
    private String acnum;

    @Column(name = "ssn", length = 20)
    private String ssn;

    public AllInfo() {}

    // All-args constructor
    public AllInfo(String fname, String mname, String lname, String gender,
                   String address, String city, String state, String country,
                   String phno, String bname, String acnum, String ssn) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.phno = phno;
        this.bname = bname;
        this.acnum = acnum;
        this.ssn = ssn;
    }

    // ===== Getters and Setters =====
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFname() { return fname; }
    public void setFname(String fname) { this.fname = fname; }

    public String getMname() { return mname; }
    public void setMname(String mname) { this.mname = mname; }

    public String getLname() { return lname; }
    public void setLname(String lname) { this.lname = lname; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getPhno() { return phno; }
    public void setPhno(String phno) { this.phno = phno; }

    public String getBname() { return bname; }
    public void setBname(String bname) { this.bname = bname; }

    public String getAcnum() { return acnum; }
    public void setAcnum(String acnum) { this.acnum = acnum; }

    public String getSsn() { return ssn; }
    public void setSsn(String ssn) { this.ssn = ssn; }
}
