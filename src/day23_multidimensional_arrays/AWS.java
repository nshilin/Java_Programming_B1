package day23_multidimensional_arrays;

public class AWS {
    public static void main(String[] args) {

        String app = "amazon";
        String env = "us-east-1, us-west-1 ,us-west-2, us-west-3";

        String[] envArr = env.split(", ");

        for (String eachEnv : envArr) {
            System.out.println(app + "is being deployed to the environment " + eachEnv + "\nDeployment completed for " + eachEnv);
        }
    }
}

