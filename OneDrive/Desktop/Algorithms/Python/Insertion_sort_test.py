import unittest
from Insertion_sort import insertion_sorting



class TestInsertionSorting(unittest.TestCase):
    def test_insertion_sorting(self):
        example = [(1, "apple"), (3, "banana"), (2, "cherry")]
        actual = insertion_sorting(example)
        expected = [[(1, "apple"), (2, "cherry"), (3, "banana")],
                    [(1, "cherry"), (3, "apple"), (2, "banana")],
                    [(1, "banana"), (2, "apple"), (3, "cherry")]
                    ]
        self.assertEqual(actual, expected)