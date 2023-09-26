#1. 10 ping pong balls are numbered 1-10 and placed in a bag. One ping pong ball is removed
#from the bag randomly. (Discrete Uniform)
#I. Find the expected value and the variance.
#ii.Find the probability that the number on the drawn ping pong ball is between 7 and 10.

number <- 1:10
x <- length(number)
mean <-(x +1)/2
variance <- (x^2 - 1)/12
cat("the mean is: ", mean)
cat("the variance is ", variance)

l <- 7
h <-10

range <- sum(number > l &number < h)
range
probability <-range/length(number)
probability

#2. Suppose there are twelve multiple choice questions in an English class quiz. 
#Each question has five possible answers, and only one of them is correct.
#Find the probability of having four or less correct answers if a student attempts to answer every question at random. (Binomial

total = dbinom(4,size =12,prob=0.2) +dbinom(3,12,0.2) +dbinom(2,12,0.2) +dbinom(1,12,0.2) + dbinom(0,12,0.2)
cat(total)
pbinom(4,12,0.2)


#3. If there are twelve cars crossing a bridge per minute on average, find the probability of
#having seventeen or more cars crossing the bridge in a particular minute.(Poisson)



#ppois(16 , lamda =12,lower =TRUE)
#ppois(16 , lamda =12,lower = FALSE)

#OR

# Average rate of occurrence (lambda) is 12 cars per minute
lambda <- 12

# Calculate the probability of having seventeen or more cars crossing the bridge
probability <- 1 - ppois(16, lambda)
cat("Probability of having seventeen or more cars:", probability, "\n")

#A sports marketer randomly selects persons on the street until he encounters someone who
#attended a game last season. What is the probability the market encounters x = 3 people who
#did not attend a game before the first success when p = 0.20 of the population attended a
##game? (Geometric)

#probability of success(p)
p<- 0.20

# Number of people you want to encounter before the first success (x)
x<-3

#calculating the probability using the negative binominal distribution
probability  <-(1 - p)^x *p


cat ("The probability of encountering " ,x,"the people who did not attend  a game before the first success is : ", probability ,"\n")

library(ggplot2)













