package exceptions;

public class Main {

	private String colour = "BLACK";
	
	public static String clr ;
	
	Main(){
		clr = "in constructor";
	}
	
	public void print() {
		System.out.println(Enum.valueOf(colour).getColour());

	}
	public String getUpper() {
		return clr;
	}

	public static void main(String[] args) {
		Main m = new Main();
		String p = m.getUpper().toUpperCase();
		
		String s = "black book";
		String printBook = s.toUpperCase();
		System.out.println(p);
	}
}

/*
 * Timestamp timestamp = new Timestamp(System.currentTimeMillis());
 * 
 * String current = "2019-02-26 19:32:29.085"; String downloadedReq =
 * "2020-01-26 19:32:29.085";
 * 
 * String[] s= downloadedReq.split(" "); // System.out.println(s[0]); String[]
 * ss = s[0].split("-"); String downloadOne = ss[1]+"/"+ss[2]+"/"+ss[0];
 * 
 * String[] s1= current.split(" "); // System.out.println(s[0]); String[] ss1 =
 * s1[0].split("-"); String currentOne = ss1[1]+"/"+ss1[2]+"/"+ss1[0];
 * 
 * 
 * try { // DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); // Date
 * date = (Date)formatter.parse(downloadOne); // java.sql.Timestamp
 * timeStampDate = new Timestamp(date.getTime());
 * 
 * SimpleDateFormat dateFormat = new SimpleDateFormat( "MM/dd/yyyy");
 * System.out.println(downloadOne); System.out.println(currentOne);
 * 
 * 
 * Date date1=(Date)dateFormat.parse(downloadOne); Date
 * date2=(Date)dateFormat.parse(currentOne); if(date1.compareTo(date2)<0) {
 * System.out.println("reject"); }else if(date1.compareTo(date2)>0) {
 * System.out.println("conutinue txn"); }
 * 
 * // System.out.println(date1);
 * 
 * // Timestamp dateTimeStamp=new Timestamp(date1.getTime()); // Timestamp
 * dateTimeStamp1=new Timestamp(date2.getTime());
 * 
 * System.out.println();
 * 
 * // System.out.println(dateTimeStamp); } catch (ParseException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); }
 * 
 * //Date d = Date.valueOf(current); //System.out.println(d); //downloaded >
 * current //left>right=1;
 * 
 * /* int correct= downloadedReq.compareTo(current); if(correct<0 || correct==0)
 * { System.out.println("Reject txnId: Download req greater than current"); }
 * 
 * //Getting the downloded value and converting it to compare with dvs String[]
 * s= downloadedReq.split(" "); // System.out.println(s[0]); String[] ss =
 * s[0].split("-");
 * 
 * //converting current for my satisfaction String[] s1= current.split(" "); //
 * System.out.println(s1[0]); String[] ss1 = s1[0].split("-");
 * 
 * String downloadOne = ss[1]+"/"+ss[2]+"/"+ss[0]; String currentOne =
 * ss1[1]+"/"+ss1[2]+"/"+ss1[0];
 * 
 * System.out.println("download "+downloadOne +" "+ "current "+currentOne); int
 * test= downloadOne.compareTo(currentOne);
 * 
 * if(test<0 || test==0) {
 * System.out.println("Reject test txnId: Download req greater than current"); }
 * 
 * //System.out.println(in);
 * 
 */

// x();

// }

/*
 * public static void x() {
 * 
 * JavaClass java = new JavaClass(); List<Integer> c = null; try { c=
 * java.run1();
 * 
 * for(Integer i:c) { System.out.println(i); }
 * 
 * } catch(Exception e) {
 * 
 * System.out.println("manin method exception");
 * 
 * 
 * } }
 */
