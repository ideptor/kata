
class Bowling:
    
    def __init__(self):
        self._pins = []

    def roll(self, pin):
        self._pins.append(pin)

    def score(self):
        sum = 0
        index = 0
        frame = 0

        for frame in range(0,10): 
            
            if self.is_strike(index) :
                sum += self._pins[index] + self.bonus_strike(index)
                index += 1
            else : 
                sum += self._pins[index] + self._pins[index+1]
                if self.is_spare(index) :
                    sum += self.bonus_spare(index)
                index += 2
                 
            
        return sum

    def is_spare(self, index):
        if self._pins[index]+self._pins[index+1] == 10 :
            return True
        return False

    def is_strike(self, index):
        if self._pins[index] == 10 :
            return True
        return False

    def bonus_spare(self, index):
        return self._pins[index+2]
    
    def bonus_strike(self, index):
        return self._pins[index+1] + self._pins[index+2]

