Using pytest

# install
> $pip install pytest

# example

```
## test.py
def test_assert():
    a = 5
    assert a == 45
```
> $ pytest test.py
```
============================= test session starts =============================
platform win32 -- Python 3.7.0, pytest-3.9.1, py-1.7.0, pluggy-0.8.0
rootdir: C:\Users\idept\Documents\GitHub\kata\tdd\Bowling-python, inifile:
collected 1 item

test.py F                                                                [100%]

================================== FAILURES ===================================
_________________________________ test_assert _________________________________

    def test_assert():
        a = 5
>       assert a == 45
E       assert 5 == 45

test.py:4: AssertionError
========================== 1 failed in 0.17 seconds ===========================
```