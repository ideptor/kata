
class Bowling:
    
    def __init__(self):
        self._scores = []

    def roll(self, pin):
        self._scores.append(pin)

    def score(self):
        sum = 0
        index = 0

        for pin in self._scores:    
            sum += pin
            if self.is_spare(index) == True : 
                sum+=self._scores[index+1]
            index += 1

        return sum

    def is_spare(self, index):
        if index > 0 and self._scores[index]+self._scores[index-1]==10 :
            return True
        return False

