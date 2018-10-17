from bowling import Bowling

def repeat_rolls(game, pin, repeat_num):
    for i in range(0, repeat_num):
        game.roll(pin)

def test_zeros():
    game = Bowling()
    repeat_rolls(game,0,20)

    assert game.score() == 0

def test_ones():
    game = Bowling()
    repeat_rolls(game,1,20)
    
    assert game.score() == 20


def test_spare():
    game = Bowling()
    game.roll(3)
    game.roll(7)
    game.roll(4)
    repeat_rolls(game,0,17)

    assert game.score() == 18   # 3+7+4+4

def test_strike():
    game = Bowling()
    game.roll(10)
    game.roll(3)
    game.roll(3)
    repeat_rolls(game, 0, 16)

    assert game.score() == 22  # 10+3+3 + 3+3

def test_last_strike():
    game = Bowling()
    repeat_rolls(game,0,18)
    game.roll(10)
    game.roll(10)
    game.roll(10)

    assert game.score() == 30