public class Student implements Comparable<Student> {
    private int id;
    private String fullName;
    private String address;
    private String phoneNumber;

    // default constructor
    public Student() {
    }

    // parameter constructor
    public Student(int id, String fullName, String address, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Get, set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    // Override toString method
    @Override
    public String toString() {
        return "Student[" +
                "Id=" + id +
                ", FullName='" + fullName + '\'' +
                ", Address='" + address + '\'' +
                ", PhoneNumber='" + phoneNumber + '\'' +
                ']';
    }
}
