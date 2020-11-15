import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.ArrayList;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java8 Stream API
		
		//List<UserDetails> list=new ArrayList<>();
		System.out.println("Start........");
		Random rd=new Random();
		List<UserDetails> list=Arrays.asList(new UserDetails(rd.ints(3).findAny().orElse(10)+"","username-"+rd.ints(1).findFirst().orElse(20),rd.nextBoolean()),
				new UserDetails(rd.ints(3).findAny().orElse(10)+"","username-"+rd.ints(1).findFirst().orElse(20),rd.nextBoolean()),
				new UserDetails(rd.ints(3).findAny().orElse(10)+"","username-"+rd.ints(1).findFirst().orElse(20),rd.nextBoolean()),
				new UserDetails(rd.ints(3).findAny().orElse(10)+"","username-"+rd.ints(1).findFirst().orElse(20),rd.nextBoolean())
				);
		List<UserDetails> newList=new ArrayList<>();
		for(int i=0;i<10;i++) {
			UserDetails dt=new UserDetails();
			dt.setId(rd.ints(3).findAny().orElse(10)+"");
			dt.setName("username-"+rd.ints(1).findFirst().orElse(20));
			dt.setIsValid(rd.nextBoolean());
			newList.add(dt);	
		}
		//Predict
		Stream<UserDetails> details=list.stream();
		
		
	
		
		// find me list of valid users
		long validUsersCount=details.filter((userDetails)->userDetails.getId().equals(userDetails.getId())).count();
		System.out.println("valid users"+validUsersCount);
		
		System.out.println("List size: "+list.size());

	}

}
