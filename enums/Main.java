package enums;

public class Main {

  public static void main(String[] args) {
    AndroidVersion ver = AndroidVersion.valueOf("OREO");

    System.out.println(ver);


    for(AndroidVersion v: AndroidVersion.values()) {
      System.out.println(v + " " + v.getVersion());
      printOpinion(v);
    }
  }

//	new Java 17 construct (does not require break, and allows multiple values per case)
	public static void printOpinion(AndroidVersion version) {
		switch (version) {
		case MARSHMALLOW -> 
			System.out.println(" Marshmallow is too old version!");
		case ANDROID_10, ANDROID_11 -> 
			System.out.println(" " + version + " is too new version. Just few phones supports it!!!");
		default -> 
			System.out.println(" " + version + " is OK.");
		}
	}
//  
//	public static void printOpinion(AndroidVersion version) {
//		switch (version) {
//		case MARSHMALLOW:
//			System.out.println(" Marshmallow is too old version!");
//			break;
//		case ANDROID_10:
//		case ANDROID_11:
//			System.out.println(" " + version + " is too new version. Just few phones supports it!!!");
//			break;
//		default:
//			System.out.println(" " + version + " is OK.");
//			break;
//		}
//	}

}
