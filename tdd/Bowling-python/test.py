from bowling import Bowling

def test_zeros():
    game = Bowling()
    repeat_rolls(game,0,20)

    assert game.score() == 0

def test_ones():
    game = Bowling()
    repeat_rolls(game,1,20)
    
    assert game.score() == 20

def repeat_rolls(game, pin, repeat_num):
    for i in range(0, repeat_num):
        game.roll(pin)