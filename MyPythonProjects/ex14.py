from sys import argv

script, user_name = argv
prompt = '==> '

print(f"\nHallo {user_name}, ich bin das {script}-script.")
print("Ich würde dir gerne ein paar Fragen stellen.")
print(f"Magst du mich {user_name}?")
likes = input(prompt)

print(f"Wo wohnst du denn, {user_name}?")
lives = input(prompt)

print("Was für einen Computer hast du?")
computer = input(prompt)

print(f"""
Alles klar, auf die Frage, ob du mich magst, hast du {likes} gesagt.
Du wohnst in {lives}. Wo soll das denn bitte sein?. 
Und du hast (einen) {computer}-Computer. Das ist wirklich Cool.
""")
