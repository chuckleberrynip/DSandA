# This is how we do a single line comment
=begin
This is how we make a multiline comment
=end

puts 3.class
puts "HelloWorld, this is my first ruby program"
puts "Hello".method(:class).class

# If you want to get user input, you would use the gets.chomp method,
# but you need to use the gets.chomp.to_i to get user input for numbers.

# print "Type in your name: "
# name = gets.chomp
# print "Type in your ID number: "
# id = gets.chomp.to_i

# puts "Your name is #{name} and your ID number is: #{id}"
puts "++++++++++++++++++++++++++++++++ Strings ++++++++++++++++++++++++++++++++"

first = "This is a string"
second = "This is the second string"
third = 123213
puts "#{first}  #{second} #{third}"
puts first.size

#There are some basic string manipulation functions:
first.upcase
second.downcase
puts first.upcase.reverse
#If you want to see if a string has a value
puts second.include? "This"
puts second.include? "Not"

#Concatenation can happen in 2 ways, one using the str.concat method and the other is using the << operator
first.concat("Hi this is another one")
second = second << "Adding something to the second one"
puts first
puts second

# One interesting feature is the ability to freeze a string
# This makes it so that you can no longer manipulate a string after it has been frozen

# fourth = "Hi this string is going to freeze"
# fourth.freeze
# fourth.concat("Something new")
# puts fourth

#Size and length and 2 methods that do the same thing.
puts "First " " Second"

#Strings can use array notation to access individual characters.
puts first[1]
#There are some other javascript like things that can be used
puts first[4..12]
puts first[0, second.size]
puts first[-1]

#Conditional statement
a = 4
b = 8
hello = (c = (a > b) ? "firstValue" : "secondValue")
puts hello


puts second.upcase[3...6]
puts "++++++++++++++++++++++++++++++++ Arrays ++++++++++++++++++++++++++++++++"
arr1 = [1,2,3,4]
arr1.push(5)
puts arr1
arr1.unshift(1000);
arr2 = Array.new(2, 4)
# You can insert multiple values from a certain index using the insert function.

puts "----------------------------------example statement-------------------------------"
arr2.insert(2, "Something", 3)
arr2.unshift("This has been unshifted")
arr2.push("This has been pushed")
puts arr2
value = arr2.shift()
values2 = arr2.pop()
puts value
puts values2

#You can drop the first n elements by using the drop(n) method
arr2.drop(3)
puts arr2
#List only the unique items in your array by using the uniq method
arr3 = arr2.uniq
puts arr3

#Now we are going to do the hash section
#Hashes are a key value data structure
#The => symbol can be substituted with the : symbol
#You can iterate throughout the hash set by iterating through it using a loop.

hash = {"name" => "Billy",
          "subject" => "science",
          "grade" => 3}
puts hash
puts "The person's name is: #{hash["name"]}"

puts "The person's information is as follow:"
hash.each_pair do |key, value|
    puts "#{key}: #{value}"
end
#There are some different variations that makes working with hashes easier
#if you want only the key: each_key
#if you want only the value: each_value

puts "++++++++++++++++++++++++++++++++ Conditionals ++++++++++++++++++++++++++++++++"
#Now we come to basic conditionals
#They are not that different from the ones in python
#merged from last commit
a = 1000
b = 1000
if a > b
    puts "a is larger than b"
elsif a == b
    puts "a is equal to b"
else
    puts "b is larger than a"
end
#There is a conditional statement the works only when the condition is false
unless a < b
    puts "Unless used"
    
end

#Switch statement:
#The else statement in this case is the default case
# puts "Please enter what the day is in the form of a number"
# day = gets.chomp.to_i
# case day
# when 1
#     puts "It is monday"
# when 2
#     puts "It is tuesday"
# else
#     puts "I don't know what the day is"
# end
puts "++++++++++++++++++++++++++++++++ Loops ++++++++++++++++++++++++++++++++"
#Now beginning iterators
for i in 1..5
    puts "Hello"
end

#iterable++ doesn't work you have to use iterable += 1
checker = 10
while checker < 20
    puts "The current number: #{checker}"
    checker += 1
end
#If we need an additional conditional within a loop, we can 
#then use a if-break-end conditional to break out a loop


tester = 15
while tester < 20
    puts "Currently: #{tester}"
    if tester == 18
        puts "Hello"
        break
    end
   tester += 1
end

#Until is a loss that works when the condition is false 
until tester > 25
    puts "Until used"
    tester += 1
end

#There is a 'next' statement that you use when you want to skip a certain value
#Use redo if you want to re-run a certain iteration
#Use retry if you want to re-run the entire loop
nextTester = 5
for i in 1..10
    if(i == nextTester)
        next
    end
    puts "This is #{i}"
end 
puts "++++++++++++++++++++++++++++++++ Methods ++++++++++++++++++++++++++++++++"
def methodTester(param1)
    puts "Hello from within the method my name is #{param1}"
end

methodTester("Mo")

class Cup 
    #This is how you set class variables
    @name
    def setName(name)
        @name = name
    end
    def getName() 
        puts "It's a cup, but its name is #{@name}"
    end
end

cup1 = Cup.new
# cup1.setName("Roger")
cup1.getName()