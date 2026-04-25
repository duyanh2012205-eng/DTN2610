import java.time.LocalDate;
import java.util.Arrays;

public class Group {

    Account creator;
    int groupID;
    String groupName;
    String creatorID;
    LocalDate createDate;
    GroupAccount[] groupAccounts;

    @Override
    public String toString() {
        return "Group{" +
                "creator=" + creator +
                ", groupID=" + groupID +
                ", groupName='" + groupName + '\'' +
                ", creatorID='" + creatorID + '\'' +
                ", createDate=" + createDate +
                ", groupAccounts=" + Arrays.toString(groupAccounts) +
                '}';
    }
}
