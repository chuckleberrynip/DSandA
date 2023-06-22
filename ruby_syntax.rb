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


puts second.upcase[3...6]

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

hash = {"name" => "Billy",
          "subject" => "science",
          "grade" => 3}
puts hash
puts "The person's name is: #{hash["name"]}"
