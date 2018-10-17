
class Bowling:
    
    def __init__(self):
        self._scores = []

    def roll(self, pin):
        self._scores.append(pin)

    def score(self):
        sum = 0
        for pin in self._scores:
            sum += pin

        return sum
