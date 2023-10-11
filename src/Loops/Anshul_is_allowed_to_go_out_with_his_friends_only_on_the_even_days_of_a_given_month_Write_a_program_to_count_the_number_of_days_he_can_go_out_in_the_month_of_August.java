package Loops;

public class Anshul_is_allowed_to_go_out_with_his_friends_only_on_the_even_days_of_a_given_month_Write_a_program_to_count_the_number_of_days_he_can_go_out_in_the_month_of_August {
    public static void main(String[] args) {
        // August has 31 days
        int out_days=0;
        int total_days_in_August=31;
        while(total_days_in_August>out_days){
            out_days+=2;
        }
        System.out.println(out_days);
    }
}
