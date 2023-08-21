#Question No. 2


# number of choices for each position
num_choices_first_letter <- 26
num_choices_second_letter <- 25
num_choices_digit <- 10

# Calculate the total no. of codes

total_number_of_codes <- num_choices_first_letter * num_choices_second_letter * num_choices_digit ^3

#print the result
#(cat ley same python ko print() jasto kam garcha yesmha)

cat("The total no. of codes: ", total_number_of_codes, "\n")

#Question No. 3

var1 = readline("Enter 1st number: ")
var2 = readline("Enter 2nd number: ")
var3 = readline("Enter 3rd number: ")

var1 = as.integer(var1)
var2 = as.integer(var2)
var3 = as.integer(var3)

total = var1 * var2 * var3 - 1

cat("The total number of codes greater than 700 are: ", total)
