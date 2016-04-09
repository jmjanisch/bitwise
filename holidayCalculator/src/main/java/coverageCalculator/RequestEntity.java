package coverageCalculator;

import java.sql.Date;

/**
 * Created by Justin Janisch on 3/26/2016.
 *
 *  Do not know if we need this class-Lora
 */
public class RequestEntity {

    private int requestId;
    private int empoloyeeId;
    private String firstName;
    private String lastName;
    private String holidayYear;
    private String preferredHolidayOff;
    private String preferredHolidayWork1;
    private String preferredHolidayWork2;

    public RequestEntity() {

    }

    public RequestEntity(int requestId, int empoloyeeId, String firstName, String lastName, String holidayYear, String preferredHolidayOff, String preferredHolidayWork1, String preferredHolidayWork2) {
        this.requestId = requestId;
        this.empoloyeeId = empoloyeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.holidayYear = holidayYear;
        this.preferredHolidayOff = preferredHolidayOff;
        this.preferredHolidayWork1 = preferredHolidayWork1;
        this.preferredHolidayWork2 = preferredHolidayWork2;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getEmpoloyeeId() {
        return empoloyeeId;
    }

    public void setEmpoloyeeId(int empoloyeeId) {
        this.empoloyeeId = empoloyeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHolidayYear() {
        return holidayYear;
    }

    public void setHolidayYear(String holidayYear) {
        this.holidayYear = holidayYear;
    }

    public String getPreferredHolidayOff() {
        return preferredHolidayOff;
    }

    public void setPreferredHolidayOff(String preferredHolidayOff) {
        this.preferredHolidayOff = preferredHolidayOff;
    }

    public String getPreferredHolidayWork1() {
        return preferredHolidayWork1;
    }

    public void setPreferredHolidayWork1(String preferredHolidayWork1) {
        this.preferredHolidayWork1 = preferredHolidayWork1;
    }

    public String getPreferredHolidayWork2() {
        return preferredHolidayWork2;
    }

    public void setPreferredHolidayWork2(String preferredHolidayWork2) {
        this.preferredHolidayWork2 = preferredHolidayWork2;
    }

    @Override
    public String toString() {
        return "RequestEntity{" +
                "requestId=" + requestId +
                ", empoloyeeId=" + empoloyeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", holidayYear=" + holidayYear +
                ", preferredHolidayOff='" + preferredHolidayOff + '\'' +
                ", preferredHolidayWork1='" + preferredHolidayWork1 + '\'' +
                ", preferredHolidayWork2='" + preferredHolidayWork2 + '\'' +
                '}';
    }
}
