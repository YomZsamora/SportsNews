
package com.adzumi.sportsnews.models;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Team implements Serializable
{

    @SerializedName("idTeam")
    @Expose
    private String idTeam;
    @SerializedName("idSoccerXML")
    @Expose
    private String idSoccerXML;
    @SerializedName("idAPIfootball")
    @Expose
    private String idAPIfootball;
    @SerializedName("intLoved")
    @Expose
    private String intLoved;
    @SerializedName("strTeam")
    @Expose
    private String strTeam;
    @SerializedName("strTeamShort")
    @Expose
    private Object strTeamShort;
    @SerializedName("strAlternate")
    @Expose
    private String strAlternate;
    @SerializedName("intFormedYear")
    @Expose
    private String intFormedYear;
    @SerializedName("strSport")
    @Expose
    private String strSport;
    @SerializedName("strLeague")
    @Expose
    private String strLeague;
    @SerializedName("idLeague")
    @Expose
    private String idLeague;
    @SerializedName("strDivision")
    @Expose
    private Object strDivision;
    @SerializedName("strManager")
    @Expose
    private String strManager;
    @SerializedName("strStadium")
    @Expose
    private String strStadium;
    @SerializedName("strKeywords")
    @Expose
    private String strKeywords;
    @SerializedName("strRSS")
    @Expose
    private String strRSS;
    @SerializedName("strStadiumThumb")
    @Expose
    private String strStadiumThumb;
    @SerializedName("strStadiumDescription")
    @Expose
    private String strStadiumDescription;
    @SerializedName("strStadiumLocation")
    @Expose
    private String strStadiumLocation;
    @SerializedName("intStadiumCapacity")
    @Expose
    private String intStadiumCapacity;
    @SerializedName("strWebsite")
    @Expose
    private String strWebsite;
    @SerializedName("strFacebook")
    @Expose
    private String strFacebook;
    @SerializedName("strTwitter")
    @Expose
    private String strTwitter;
    @SerializedName("strInstagram")
    @Expose
    private String strInstagram;
    @SerializedName("strDescriptionEN")
    @Expose
    private String strDescriptionEN;
    @SerializedName("strDescriptionDE")
    @Expose
    private Object strDescriptionDE;
    @SerializedName("strDescriptionFR")
    @Expose
    private Object strDescriptionFR;
    @SerializedName("strDescriptionCN")
    @Expose
    private Object strDescriptionCN;
    @SerializedName("strDescriptionIT")
    @Expose
    private Object strDescriptionIT;
    @SerializedName("strDescriptionJP")
    @Expose
    private Object strDescriptionJP;
    @SerializedName("strDescriptionRU")
    @Expose
    private Object strDescriptionRU;
    @SerializedName("strDescriptionES")
    @Expose
    private Object strDescriptionES;
    @SerializedName("strDescriptionPT")
    @Expose
    private Object strDescriptionPT;
    @SerializedName("strDescriptionSE")
    @Expose
    private Object strDescriptionSE;
    @SerializedName("strDescriptionNL")
    @Expose
    private Object strDescriptionNL;
    @SerializedName("strDescriptionHU")
    @Expose
    private Object strDescriptionHU;
    @SerializedName("strDescriptionNO")
    @Expose
    private Object strDescriptionNO;
    @SerializedName("strDescriptionIL")
    @Expose
    private Object strDescriptionIL;
    @SerializedName("strDescriptionPL")
    @Expose
    private Object strDescriptionPL;
    @SerializedName("strGender")
    @Expose
    private String strGender;
    @SerializedName("strCountry")
    @Expose
    private String strCountry;
    @SerializedName("strTeamBadge")
    @Expose
    private String strTeamBadge;
    @SerializedName("strTeamJersey")
    @Expose
    private String strTeamJersey;
    @SerializedName("strTeamLogo")
    @Expose
    private String strTeamLogo;
    @SerializedName("strTeamFanart1")
    @Expose
    private String strTeamFanart1;
    @SerializedName("strTeamFanart2")
    @Expose
    private String strTeamFanart2;
    @SerializedName("strTeamFanart3")
    @Expose
    private String strTeamFanart3;
    @SerializedName("strTeamFanart4")
    @Expose
    private String strTeamFanart4;
    @SerializedName("strTeamBanner")
    @Expose
    private String strTeamBanner;
    @SerializedName("strYoutube")
    @Expose
    private String strYoutube;
    @SerializedName("strLocked")
    @Expose
    private String strLocked;
    private final static long serialVersionUID = 4904653645745043659L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Team() {
    }

    /**
     * 
     * @param intStadiumCapacity
     * @param strTeamShort
     * @param strSport
     * @param strDescriptionCN
     * @param strTeamJersey
     * @param strTeamFanart2
     * @param strTeamFanart3
     * @param strTeamFanart4
     * @param strStadiumDescription
     * @param strTeamFanart1
     * @param intLoved
     * @param idLeague
     * @param idSoccerXML
     * @param strTeamLogo
     * @param strDescriptionSE
     * @param strDescriptionJP
     * @param strDescriptionFR
     * @param strStadiumLocation
     * @param strDescriptionNL
     * @param strCountry
     * @param strRSS
     * @param strDescriptionRU
     * @param strTeamBanner
     * @param strDescriptionNO
     * @param strStadiumThumb
     * @param strDescriptionES
     * @param intFormedYear
     * @param strInstagram
     * @param strDescriptionIT
     * @param idTeam
     * @param strDescriptionEN
     * @param strWebsite
     * @param strYoutube
     * @param strDescriptionIL
     * @param idAPIfootball
     * @param strLocked
     * @param strAlternate
     * @param strTeam
     * @param strTwitter
     * @param strDescriptionHU
     * @param strGender
     * @param strDivision
     * @param strStadium
     * @param strFacebook
     * @param strTeamBadge
     * @param strDescriptionPT
     * @param strDescriptionDE
     * @param strLeague
     * @param strManager
     * @param strKeywords
     * @param strDescriptionPL
     */
    public Team(String idTeam, String idSoccerXML, String idAPIfootball, String intLoved, String strTeam, Object strTeamShort, String strAlternate, String intFormedYear, String strSport, String strLeague, String idLeague, Object strDivision, String strManager, String strStadium, String strKeywords, String strRSS, String strStadiumThumb, String strStadiumDescription, String strStadiumLocation, String intStadiumCapacity, String strWebsite, String strFacebook, String strTwitter, String strInstagram, String strDescriptionEN, Object strDescriptionDE, Object strDescriptionFR, Object strDescriptionCN, Object strDescriptionIT, Object strDescriptionJP, Object strDescriptionRU, Object strDescriptionES, Object strDescriptionPT, Object strDescriptionSE, Object strDescriptionNL, Object strDescriptionHU, Object strDescriptionNO, Object strDescriptionIL, Object strDescriptionPL, String strGender, String strCountry, String strTeamBadge, String strTeamJersey, String strTeamLogo, String strTeamFanart1, String strTeamFanart2, String strTeamFanart3, String strTeamFanart4, String strTeamBanner, String strYoutube, String strLocked) {
        super();
        this.idTeam = idTeam;
        this.idSoccerXML = idSoccerXML;
        this.idAPIfootball = idAPIfootball;
        this.intLoved = intLoved;
        this.strTeam = strTeam;
        this.strTeamShort = strTeamShort;
        this.strAlternate = strAlternate;
        this.intFormedYear = intFormedYear;
        this.strSport = strSport;
        this.strLeague = strLeague;
        this.idLeague = idLeague;
        this.strDivision = strDivision;
        this.strManager = strManager;
        this.strStadium = strStadium;
        this.strKeywords = strKeywords;
        this.strRSS = strRSS;
        this.strStadiumThumb = strStadiumThumb;
        this.strStadiumDescription = strStadiumDescription;
        this.strStadiumLocation = strStadiumLocation;
        this.intStadiumCapacity = intStadiumCapacity;
        this.strWebsite = strWebsite;
        this.strFacebook = strFacebook;
        this.strTwitter = strTwitter;
        this.strInstagram = strInstagram;
        this.strDescriptionEN = strDescriptionEN;
        this.strDescriptionDE = strDescriptionDE;
        this.strDescriptionFR = strDescriptionFR;
        this.strDescriptionCN = strDescriptionCN;
        this.strDescriptionIT = strDescriptionIT;
        this.strDescriptionJP = strDescriptionJP;
        this.strDescriptionRU = strDescriptionRU;
        this.strDescriptionES = strDescriptionES;
        this.strDescriptionPT = strDescriptionPT;
        this.strDescriptionSE = strDescriptionSE;
        this.strDescriptionNL = strDescriptionNL;
        this.strDescriptionHU = strDescriptionHU;
        this.strDescriptionNO = strDescriptionNO;
        this.strDescriptionIL = strDescriptionIL;
        this.strDescriptionPL = strDescriptionPL;
        this.strGender = strGender;
        this.strCountry = strCountry;
        this.strTeamBadge = strTeamBadge;
        this.strTeamJersey = strTeamJersey;
        this.strTeamLogo = strTeamLogo;
        this.strTeamFanart1 = strTeamFanart1;
        this.strTeamFanart2 = strTeamFanart2;
        this.strTeamFanart3 = strTeamFanart3;
        this.strTeamFanart4 = strTeamFanart4;
        this.strTeamBanner = strTeamBanner;
        this.strYoutube = strYoutube;
        this.strLocked = strLocked;
    }

    public String getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(String idTeam) {
        this.idTeam = idTeam;
    }

    public String getIdSoccerXML() {
        return idSoccerXML;
    }

    public void setIdSoccerXML(String idSoccerXML) {
        this.idSoccerXML = idSoccerXML;
    }

    public String getIdAPIfootball() {
        return idAPIfootball;
    }

    public void setIdAPIfootball(String idAPIfootball) {
        this.idAPIfootball = idAPIfootball;
    }

    public String getIntLoved() {
        return intLoved;
    }

    public void setIntLoved(String intLoved) {
        this.intLoved = intLoved;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public void setStrTeam(String strTeam) {
        this.strTeam = strTeam;
    }

    public Object getStrTeamShort() {
        return strTeamShort;
    }

    public void setStrTeamShort(Object strTeamShort) {
        this.strTeamShort = strTeamShort;
    }

    public String getStrAlternate() {
        return strAlternate;
    }

    public void setStrAlternate(String strAlternate) {
        this.strAlternate = strAlternate;
    }

    public String getIntFormedYear() {
        return intFormedYear;
    }

    public void setIntFormedYear(String intFormedYear) {
        this.intFormedYear = intFormedYear;
    }

    public String getStrSport() {
        return strSport;
    }

    public void setStrSport(String strSport) {
        this.strSport = strSport;
    }

    public String getStrLeague() {
        return strLeague;
    }

    public void setStrLeague(String strLeague) {
        this.strLeague = strLeague;
    }

    public String getIdLeague() {
        return idLeague;
    }

    public void setIdLeague(String idLeague) {
        this.idLeague = idLeague;
    }

    public Object getStrDivision() {
        return strDivision;
    }

    public void setStrDivision(Object strDivision) {
        this.strDivision = strDivision;
    }

    public String getStrManager() {
        return strManager;
    }

    public void setStrManager(String strManager) {
        this.strManager = strManager;
    }

    public String getStrStadium() {
        return strStadium;
    }

    public void setStrStadium(String strStadium) {
        this.strStadium = strStadium;
    }

    public String getStrKeywords() {
        return strKeywords;
    }

    public void setStrKeywords(String strKeywords) {
        this.strKeywords = strKeywords;
    }

    public String getStrRSS() {
        return strRSS;
    }

    public void setStrRSS(String strRSS) {
        this.strRSS = strRSS;
    }

    public String getStrStadiumThumb() {
        return strStadiumThumb;
    }

    public void setStrStadiumThumb(String strStadiumThumb) {
        this.strStadiumThumb = strStadiumThumb;
    }

    public String getStrStadiumDescription() {
        return strStadiumDescription;
    }

    public void setStrStadiumDescription(String strStadiumDescription) {
        this.strStadiumDescription = strStadiumDescription;
    }

    public String getStrStadiumLocation() {
        return strStadiumLocation;
    }

    public void setStrStadiumLocation(String strStadiumLocation) {
        this.strStadiumLocation = strStadiumLocation;
    }

    public String getIntStadiumCapacity() {
        return intStadiumCapacity;
    }

    public void setIntStadiumCapacity(String intStadiumCapacity) {
        this.intStadiumCapacity = intStadiumCapacity;
    }

    public String getStrWebsite() {
        return strWebsite;
    }

    public void setStrWebsite(String strWebsite) {
        this.strWebsite = strWebsite;
    }

    public String getStrFacebook() {
        return strFacebook;
    }

    public void setStrFacebook(String strFacebook) {
        this.strFacebook = strFacebook;
    }

    public String getStrTwitter() {
        return strTwitter;
    }

    public void setStrTwitter(String strTwitter) {
        this.strTwitter = strTwitter;
    }

    public String getStrInstagram() {
        return strInstagram;
    }

    public void setStrInstagram(String strInstagram) {
        this.strInstagram = strInstagram;
    }

    public String getStrDescriptionEN() {
        return strDescriptionEN;
    }

    public void setStrDescriptionEN(String strDescriptionEN) {
        this.strDescriptionEN = strDescriptionEN;
    }

    public Object getStrDescriptionDE() {
        return strDescriptionDE;
    }

    public void setStrDescriptionDE(Object strDescriptionDE) {
        this.strDescriptionDE = strDescriptionDE;
    }

    public Object getStrDescriptionFR() {
        return strDescriptionFR;
    }

    public void setStrDescriptionFR(Object strDescriptionFR) {
        this.strDescriptionFR = strDescriptionFR;
    }

    public Object getStrDescriptionCN() {
        return strDescriptionCN;
    }

    public void setStrDescriptionCN(Object strDescriptionCN) {
        this.strDescriptionCN = strDescriptionCN;
    }

    public Object getStrDescriptionIT() {
        return strDescriptionIT;
    }

    public void setStrDescriptionIT(Object strDescriptionIT) {
        this.strDescriptionIT = strDescriptionIT;
    }

    public Object getStrDescriptionJP() {
        return strDescriptionJP;
    }

    public void setStrDescriptionJP(Object strDescriptionJP) {
        this.strDescriptionJP = strDescriptionJP;
    }

    public Object getStrDescriptionRU() {
        return strDescriptionRU;
    }

    public void setStrDescriptionRU(Object strDescriptionRU) {
        this.strDescriptionRU = strDescriptionRU;
    }

    public Object getStrDescriptionES() {
        return strDescriptionES;
    }

    public void setStrDescriptionES(Object strDescriptionES) {
        this.strDescriptionES = strDescriptionES;
    }

    public Object getStrDescriptionPT() {
        return strDescriptionPT;
    }

    public void setStrDescriptionPT(Object strDescriptionPT) {
        this.strDescriptionPT = strDescriptionPT;
    }

    public Object getStrDescriptionSE() {
        return strDescriptionSE;
    }

    public void setStrDescriptionSE(Object strDescriptionSE) {
        this.strDescriptionSE = strDescriptionSE;
    }

    public Object getStrDescriptionNL() {
        return strDescriptionNL;
    }

    public void setStrDescriptionNL(Object strDescriptionNL) {
        this.strDescriptionNL = strDescriptionNL;
    }

    public Object getStrDescriptionHU() {
        return strDescriptionHU;
    }

    public void setStrDescriptionHU(Object strDescriptionHU) {
        this.strDescriptionHU = strDescriptionHU;
    }

    public Object getStrDescriptionNO() {
        return strDescriptionNO;
    }

    public void setStrDescriptionNO(Object strDescriptionNO) {
        this.strDescriptionNO = strDescriptionNO;
    }

    public Object getStrDescriptionIL() {
        return strDescriptionIL;
    }

    public void setStrDescriptionIL(Object strDescriptionIL) {
        this.strDescriptionIL = strDescriptionIL;
    }

    public Object getStrDescriptionPL() {
        return strDescriptionPL;
    }

    public void setStrDescriptionPL(Object strDescriptionPL) {
        this.strDescriptionPL = strDescriptionPL;
    }

    public String getStrGender() {
        return strGender;
    }

    public void setStrGender(String strGender) {
        this.strGender = strGender;
    }

    public String getStrCountry() {
        return strCountry;
    }

    public void setStrCountry(String strCountry) {
        this.strCountry = strCountry;
    }

    public String getStrTeamBadge() {
        return strTeamBadge;
    }

    public void setStrTeamBadge(String strTeamBadge) {
        this.strTeamBadge = strTeamBadge;
    }

    public String getStrTeamJersey() {
        return strTeamJersey;
    }

    public void setStrTeamJersey(String strTeamJersey) {
        this.strTeamJersey = strTeamJersey;
    }

    public String getStrTeamLogo() {
        return strTeamLogo;
    }

    public void setStrTeamLogo(String strTeamLogo) {
        this.strTeamLogo = strTeamLogo;
    }

    public String getStrTeamFanart1() {
        return strTeamFanart1;
    }

    public void setStrTeamFanart1(String strTeamFanart1) {
        this.strTeamFanart1 = strTeamFanart1;
    }

    public String getStrTeamFanart2() {
        return strTeamFanart2;
    }

    public void setStrTeamFanart2(String strTeamFanart2) {
        this.strTeamFanart2 = strTeamFanart2;
    }

    public String getStrTeamFanart3() {
        return strTeamFanart3;
    }

    public void setStrTeamFanart3(String strTeamFanart3) {
        this.strTeamFanart3 = strTeamFanart3;
    }

    public String getStrTeamFanart4() {
        return strTeamFanart4;
    }

    public void setStrTeamFanart4(String strTeamFanart4) {
        this.strTeamFanart4 = strTeamFanart4;
    }

    public String getStrTeamBanner() {
        return strTeamBanner;
    }

    public void setStrTeamBanner(String strTeamBanner) {
        this.strTeamBanner = strTeamBanner;
    }

    public String getStrYoutube() {
        return strYoutube;
    }

    public void setStrYoutube(String strYoutube) {
        this.strYoutube = strYoutube;
    }

    public String getStrLocked() {
        return strLocked;
    }

    public void setStrLocked(String strLocked) {
        this.strLocked = strLocked;
    }

}
