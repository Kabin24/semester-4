#1
factorial(3)


#2
perm = function(n,x){
  factorial(n)/factorial(n-x)
}
perm(10,2)

#3
comb = function(n,x){
  factorial(n)/(factorial(n-x)*factorial(x))
}
comb(10,2)
#4
install.packages('gtools')
#load library
library(gtools)
#run with 3 balls
x <- c('red', 'blue', 'black')
#pick 2 balls from the urn with replacement
#get all permutations
permutations(n=3,r=2,v=x,repeats.allowed=T)


5.
#to find number of row

nrow(permutations(n=3,r=2,v=x,repeats.allowed=F))



