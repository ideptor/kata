
class Bowling:
    
    def __init__(self):
        self._scores = []

    def roll(self, pin):
        self._scores.append(pin)

    def score(self):
        sum = 0
        index = 0
        frame = 0

        for pin in self._scores:    
            
            if self.is_strike(index) :
                sum += pin + self._scores[index+1] + self._scores[index+2]
                frame += 0.5
            elif self.is_spare(index) : 
                sum += pin + self._scores[index+1]              
            else:
                sum += pin

            index += 1
            frame += 0.5
            
            if frame >= 10:
                break

        return sum

    def is_spare(self, index):
        if index > 0 and self._scores[index]+self._scores[index-1] == 10 :
            return True
        return False

    def is_strike(self, index):
        if self._scores[index] == 10 :
            return True
        return False

