import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class PaloAltonwOne {

    class User {
        int bldg;
        int room;
        String msg;

    }
}


    //PA n/w
 /*   List<User> users = new ArrayList<User>();
    Map<Integer , Map<Integer, List<User>>> bldgToMapOfRoomToUsers = new HashMap<>();
    Map<Integer, List<User>> roomToUsers = null; // new HashMap<>();

        for(User u : users) {
        int bldg = u.bldg;
        int room = u.room;
        if(bldgToMapOfRoomToUsers.containsKey(bldg)) {
            roomToUsers = bldgToMapOfRoomToUsers.get(bldg);
            if(roomToUsers.containsKey(room)) {
                roomToUsers.get(room).add(u);
            } else {
                List userList = new ArrayList<User>();
                userList.add(u);

                roomToUsers.put(room,userList);

            }

        } else {

                /*
                    Create UserList, create roomToUserMap, put in roomToUserMap & insert in bldgMap
                 */
            //create user list
    /*
            List userList = new ArrayList<User>();
            userList.add(u);

            //create roomToUser map
            Map<Integer,List<User>> roomToUser = new HashMap<>();
            roomToUser.put(room,userList);

            //add to bldgToMapOfRoomToUsers
            bldgToMapOfRoomToUsers.put(bldg,roomToUser);

        }

        if(roomToUsers.containsKey(room)) {
            roomToUsers.get(room).add(u);

        } else {
            List userList = new ArrayList<User>();
            userList.add(u);
            roomToUsers.put(room,userList);
        }

    }


}
*/
/*
class PaloAltoTwo {
    class Message {
        int bldg
        int room
        String msg
    }

    class User {
        int bldg
        int room
        recvMsg()
    }

    List<Message> messages
    List<User> users


    Map<String, List<User> userLocMap
for(User u : users) {
        int room = u.room;
        int bldg = u.bldg;

        String key = bldg-room

        if(!userLocMap.contains(key)) {
            userLocMap.put(key, new ArrayList())
        }
        userLocMap.get(key).add(u);
    }

for(Message m : messages) {
        for(User u : users) {
            if(m.bldg == u.bldg && m.room == u.room) {
                u.recvMsg();
            }
        }
    }
}
*/
