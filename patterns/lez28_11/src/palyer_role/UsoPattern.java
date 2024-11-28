package palyer_role;

class AttendanceRole{}

abstract class LevelRole{}

class FulltimeRole extends AttendanceRole{
    @Override
    public String toString() {
	return "FULLTIME";
    }
}

class Student{
    AttendanceRole attendanceRole;
    LevelRole levelRole;
    @Override
    public String toString() {
	return attendanceRole.toString();
    }
}

public class UsoPattern {

}
