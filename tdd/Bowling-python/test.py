from bowling import Bowling

def test_zeros():
    game = Bowling()
    for i in range(0,20):
        game.roll(0)

    assert game.sum() == 0