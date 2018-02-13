text = """Hier kann ein x-beliebiber 
		Text untersucht werden.
		Am besten an dieser Stelle eine Datei öffnen."""
puts "\nDer Text enthält folgende Buchstaben: "
text.downcase!
freqs = {}
freqs.default = 0

text.each_char { |char| freqs[char] += 1}
puts "\n"
("a".."z").each {|x| puts "#{x} : #{freqs[x]}" }

puts "\nWell, that's interesting, isn't it?\n"
puts "\n"

