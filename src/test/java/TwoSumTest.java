import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    private static TwoSum twoSum;
    int[] arr = new int[]{10000, 560, 338, 168, 407, 520, 854, 816, 325, 761, 665, 788, 403, 937, 22, 321, 276, 596, 448, 800, 45, 143, 22, 21,
            483, 950, 556, 671, 465, 5, 85, 626, 416, 957, 639, 368, 891, 516, 644, 490, 28, 731, 380, 4, 476, 784, 880, 914, 614, 602, 298, 304,
            285, 770, 278, 39, 53, 907, 82, 987, 960, 971, 288, 581, 98, 664, 666, 469, 858, 477, 441, 898, 614, 696, 534, 504, 688, 108, 517,
            167, 940, 7, 966, 631, 943, 556, 613, 656, 774, 498, 199, 587, 650, 742, 207, 349, 235, 319, 731, 30, 235, 816, 564, 438, 38, 439,
            234, 222, 531, 495, 95, 416, 906, 239, 810, 549, 212, 681, 491, 798, 661, 204, 541, 997, 196, 550, 757, 708, 638, 22, 582, 977, 800,
            558, 475, 838, 331, 660, 252, 110, 672, 41, 904, 539, 445, 236, 847, 874, 803, 374, 755, 46, 741, 752, 160, 215, 138, 856, 754, 81,
            363, 996, 915, 529, 580, 775, 317, 360, 529, 197, 594, 618, 419, 350, 964, 729, 769, 232, 387, 520, 474, 476, 296, 957, 105, 457, 225,
            324, 480, 472, 637, 432, 837, 492, 126, 369, 504, 280, 704, 255, 853, 496, 326, 429, 431, 791, 882, 504, 611, 784, 917, 796, 800, 254,
            965, 651, 213, 825, 964, 356, 527, 946, 453, 403, 222, 948, 325, 69, 300, 561, 767, 467, 142, 329, 641, 448, 680, 994, 949, 981, 717,
            62, 235, 953, 197, 463, 738, 633, 453, 387, 867, 398, 971, 178, 79, 711, 33, 394, 593, 760, 644, 971, 434, 584, 533, 765, 184, 34,
            664, 600, 496, 385, 589, 373, 833, 986, 203, 664, 137, 879, 943, 803, 126, 952, 231, 304, 699, 785, 10, 111, 493, 59, 561, 165, 980,
            49, 391, 387, 620, 488, 870, 270, 495, 823, 481, 947, 531, 674, 993, 780, 884, 159, 590, 202, 333, 550, 37, 818, 536, 660, 230, 538,
            824, 236, 75, 792, 810, 605, 490, 769, 456, 787, 479, 925, 414, 294, 639, 971, 363, 887, 161, 919, 827, 619, 393, 776, 430, 611, 268,
            948, 828, 118, 482, 428, 635, 643, 106, 430, 502, 8, 444, 185, 115, 567, 339, 257, 315, 959, 796, 868, 705, 124, 742, 427, 99, 610, 0,
            629, 900, 550, 38, 283, 51, 80, 878, 258, 480, 382, 619, 776, 98, 975, 386, 590, 254, 364, 167, 471, 211, 659, 913, 831, 667, 322,
            484, 210, 533, 767, 515, 868, 217, 141, 36, 648, 404, 245, 728, 882, 928, 231, 27, 85, 641, 391, 902, 830, 336, 95, 17, 295, 667, 678,
            177, 603, 719, 894, 375, 294, 331, 339, 548, 948, 539, 128, 108, 233, 531, 987, 654, 443, 324, 815, 839, 855, 968, 761, 208, 118, 453,
            792, 989, 222, 651, 761, 237, 514, 580, 32, 419, 638, 975, 764, 530, 268, 659, 83, 97, 964, 500, 491, 958, 525, 794, 30, 557, 771,
            748, 918, 583, 751, 395, 594, 191, 19, 638, 383, 704, 757, 350, 254, 655, 197, 393, 504, 259, 17, 195, 515, 931, 132, 33, 148, 244,
            566, 507, 715, 829, 890, 774, 970, 50, 80, 973, 976, 953, 472, 963, 261, 889, 927, 892, 201, 436, 239, 377, 120, 712, 264, 44, 237,
            957, 271, 978, 195, 280, 510, 181, 576, 843, 80, 499, 513, 303, 733, 591, 235, 287, 390, 424, 126, 801, 796, 470, 686, 954, 904, 242,
            603, 100, 309, 70, 968, 529, 278, 43, 609, 124, 718, 844, 357, 986, 709, 831, 79, 893, 78, 62, 231, 600, 855, 131, 734, 385, 350, 629,
            992, 9, 22, 747, 951, 169, 272, 57, 200, 847, 795, 769, 244, 484, 122, 842, 266, 731, 581, 172, 841, 655, 948, 688, 364, 653, 725,
            613, 136, 19, 73, 330, 417, 40, 171, 258, 3, 762, 942, 902, 303, 40, 832, 759, 227, 342, 637, 98, 642, 799, 129, 705, 569, 389, 611,
            574, 815, 779, 381, 167, 196, 255, 471, 334, 76, 395, 997, 162, 511, 620, 868, 61, 890, 506, 643, 156, 599, 820, 811, 620, 885, 547,
            849, 937, 831, 792, 986, 201, 32, 339, 731, 463, 353, 814, 865, 836, 945, 857, 770, 532, 473, 442, 706, 248, 426, 499, 852, 370, 202,
            299, 741, 260, 625, 627, 994, 487, 453, 638, 115, 251, 460, 436, 461, 396, 642, 828, 413, 350, 163, 418, 206, 44, 715, 184, 816, 377,
            85, 962, 831, 56, 829, 784, 221, 725, 144, 877, 505, 128, 214, 208, 884, 672, 532, 878, 534, 187, 957, 334, 401, 838, 575, 303, 523,
            141, 714, 622, 102, 764, 866, 619, 324, 340, 607, 528, 158, 833, 52, 479, 206, 76, 810, 971, 989, 6, 900, 388, 942, 737, 571, 14, 768,
            100, 534, 247, 757, 447, 680, 153, 107, 567, 948, 309, 321, 299, 644, 894, 222, 20, 206, 350, 238, 531, 51, 518, 159, 955, 925, 68,
            708, 231, 899, 194, 894, 403, 946, 14, 328, 433, 888, 852, 364, 488, 304, 574, 190, 686, 920, 478, 758, 107, 887, 797, 751, 463, 317,
            735, 626, 204, 408, 109, 137, 986, 519, 81, 628, 367, 572, 179, 851, 332, 252, 779, 983, 715, 560, 495, 48, 911, 424, 475, 941, 299,
            219, 417, 840, 659, 263, 243, 842, 495, 576, 754, 314, 558, 435, 261, 572, 100, 569, 145, 198, 305, 156, 531, 500, 120, 106, 779, 386,
            263, 554, 296, 184, 448, 845, 239, 736, 8, 775, 69, 449, 942, 321, 509, 857, 92, 593, 439, 615, 579, 295, 422, 816, 853, 534, 53, 970,
            706, 454, 98, 951, 394, 750, 438, 795, 566, 847, 134, 240, 42, 168, 586, 503, 609, 680, 606, 921, 926, 654, 435, 710, 285, 351, 150,
            286, 487, 200, 687, 314, 302, 851, 673, 865, 41, 391, 604, 884, 575, 922, 456, 417, 725, 646, 686, 937, 329, 575, 715, 443, 443, 0,
            422, 912, 87, 883, 874, 140, 638, 424, 486, 911, 511, 141, 111, 7, 8, 936, 64, 520, 323, 802, 945, 531, 498, 4, 217, 288, 772, 796,
            904, 646, 173, 11, 427, 659, 375, 128, 566, 920, 824, 764, 761, 444, 903, 869, 496, 635, 390, 312, 284, 140, 840, 928, 876, 233, 561,
            582, 658, 660, 771, 237, 854, 793, 147, 576, 67, 300, 445, 214, 903, 496, 67, 142, 892, 996, 466, 647, 720, 262, 54, 560, 783, 203,
            846, 374, 458, 2, 422, 468, 54, 948, 891, 380, 318, 182, 497, 860, 547, 881, 133, 202, 789, 629, 554, 176, 383, 391, 297, 763, 74,
            785, 360, 725, 258, 101, 513, 17, 484, 832, 678, 955, 193, 307, 250, 32, 834, 400, 311, 323, 898, 178, 696, 391, 131, 782, 555, 760,
            167, 794, 552, 40, 85, 859, 149, 997, 953, 314, 468, 964, 230, 172, 63, 242, 41, 870, 591, 312, 688, 825, 734, 982, 476, 977, 950,
            863, 862, 183, 589, 888, 161, 550, 643, 949, 601, 522, 961, 102, 271, 816, 59, 219, 605, 110, 734, 391, 419, 719, 605, 880, 123, 377,
            322, 933, 703, 607, 650, 278, 215, 143, 836, 738, 72, 283, 680, 964, 127, 73, 517, 946, 648, 736, 859, 613, 550, 817, 810, 527, 934,
            107, 497, 431, 806, 515, 644, 116, 58, 721, 126, 928, 251, 615, 802, 0, 454, 240, 171, 180, 416, 197, 446, 506, 667, 261, 425, 970,
            685, 234, 164, 298, 163, 922, 813, 422, 533, 492, 133, 328, 321, 330, 166, 27, 628, 10, 238, 452, 12, 883, 968, 168, 302, 341, 261,
            968, 432, 797, 309, 535, 213, 7, 465, 574, 79, 413, 509, 65, 199, 856, 190, 494, 69, 87, 150, 268, 629, 259, 302, 794, 160, 737, 461,
            84, 789, 338, 590, 124, 177, 374, 314, 643, 68, 679, 463, 402, 736, 156, 273, 554, 0, 198, 537, 182, 418, 812, 433, 611, 437, 127,
            972, 724, 822, 484, 26, 37, 387, 290, 650, 10, 145, 302, 8, 647, 312, 130, 533, 212, 195, 272, 93, 560, 907, 156, 818, 369, 11, 285,
            980, 340, 656, 776, 717, 267, 493, 307, 722, 691, 699, 684, 976, 798, 696, 82, 474, 84, 785, 259, 465, 271, 709, 904, 83, 958, 365,
            665, 454, 458, 270, 266, 249, 355, 89, 582, 407, 357, 542, 483, 235, 128, 258, 775, 397, 940, 683, 562, 328, 102, 8, 929, 500, 385,
            151, 927, 552, 817, 267, 455, 742, 547, 883, 789, 327, 721, 760, 191, 478, 661, 767, 231, 76, 962, 615, 210, 268, 555, 65, 340, 972,
            135, 328, 153, 624, 855, 698, 928, 325, 633, 155, 808, 211, 940, 548, 686, 310, 468, 191, 842, 352, 663, 203, 808, 28, 695, 674, 903,
            943, 77, 779, 427, 105, 820, 320, 532, 110, 679, 755, 417, 315, 816, 692, 555, 221, 919, 968, 372, 938, 635, 921, 920, 97, 992, 175,
            846, 839, 328, 280, 165, 503, 141, 854, 152, 481, 173, 435, 944, 300, 9, 145, 300, 344, 426, 367, 325, 821, 759, 93, 877, 480, 572,
            288, 779, 342, 998, 605, 955, 172, 223, 57, 72, 735, 726, 783, 318, 918, 15, 900, 482, 653, 853, 529, 600, 215, 154, 457, 52, 844, 993,
            612, 131, 870, 486, 447, 801, 448, 584, 570, 564, 800, 214, 492, 99, 361, 549, 139, 611, 556, 637, 870, 643, 32, 30, 97, 427, 31, 562,
            243, 721, 266, 930, 699, 490, 83, 238, 648, 707, 914, 287, 102, 17, 51, 962, 274, 993, 512, 704, 445, 256, 370, 732, 821, 768, 243, 373,
            491, 194, 769, 569, 471, 370, 807, 422, 5, 524, 778, 391, 760, 128, 51, 601, 250, 916, 507, 573, 881, 897, 457, 553, 289, 926, 922, 561,
            206, 726, 827, 185, 991, 91, 101, 180, 60, 342, 780, 880, 900, 47, 176, 510, 44, 409, 891, 562, 380, 716, 945, 452, 417, 729, 581, 872,
            696, 895, 374, 377, 350, 857, 99, 942, 940, 801, 464, 479, 69, 787, 198, 538, 966, 399, 195, 708, 177, 680, 354, 575, 735, 573, 541, 417,
            696, 807, 613, 238, 743, 452, 747, 102, 603, 160, 438, 246, 431, 473, 380, 859, 904, 410, 126, 977, 742, 979, 836, 444, 530, 167, 662,
            490, 238, 433, 309, 60, 584, 724, 101, 672, 429, 552, 429, 245, 736, 728, 827, 31, 232, 940, 31, 509, 785, 473, 278, 883, 717, 27, 811,
            571, 687, 755, 7, 938, 550, 383, 804, 351, 582, 475, 144, 530, 793, 726, 931, 77, 593, 440, 644, 15, 971, 189, 79, 150, 454, 48, 879, 69,
            571, 654, 436, 634, 226, 801, 463, 903, 373, 240, 62, 508, 663, 832, 365, 649, 280, 239, 902, 55, 989, 897, 700, 409, 565, 80, 734, 21,
            138, 514, 760, 739, 672, 128, 756, 418, 738, 198, 152, 557, 7, 400, 799, 98, 362, 971, 141, 731, 364, 495, 382, 490, 859, 614, 533, 863,
            899, 317, 81, 111, 763, 314, 712, 7, 813, 404, 933, 745, 102, 690, 660, 333, 156, 931, 859, 405, 110, 350, 79, 991, 411, 695, 314, 478,
            660, 454, 943, 678, 760, 669, 646, 649, 413, 949, 91, 661, 213, 909, 879, 523, 12, 433, 700, 260, 985, 917, 907, 36, 822, 828, 746, 45,
            798, 746, 300, 64, 16, 320, 785, 255, 14, 434, 220, 834, 41, 235, 668, 181, 753, 567, 141, 43, 751, 810, 29, 539, 420, 54, 378, 781, 733,
            50, 644, 55, 286, 416, 615, 671, 623, 92, 8, 800, 39, 167, 931, 827, 437, 798, 734, 7, 474, 90, 34, 528, 213, 496, 613, 371, 711, 494,
            672, 727, 487, 65, 440, 115, 632, 741, 457, 771, 393, 814, 948, 282, 408, 641, 563, 979, 433, 832, 450, 50, 317, 507, 22, 930, 180, 766,
            39, 41, 234, 941, 601, 613, 470, 209, 440, 899, 460, 685, 467, 807, 857, 137, 862, 632, 812, 76, 128, 322, 368, 94, 450, 468, 120, 941,
            356, 976, 843, 65, 184, 240, 544, 994, 83, 447, 403, 225, 320, 549, 379, 45, 478, 368, 814, 1, 724, 198, 250, 600, 689, 302, 801, 157,
            696, 672, 856, 651, 956, 470, 583, 818, 128, 651, 688, 741, 92, 360, 174, 642, 102, 816, 353, 608, 530, 608, 229, 582, 262, 452, 452,
            973, 429, 766, 470, 914, 577, 602, 131, 306, 545, 837, 986, 492, 320, 774, 752, 609, 851, 720, 924, 400, 381, 455, 315, 559, 124, 923,
            381, 470, 249, 943, 565, 559, 974, 192, 508, 324, 264, 238, 925, 521, 33, 924, 127, 914, 991, 4, 674, 451, 281, 492, 390, 729, 805, 862,
            38, 139, 736, 872, 269, 116, 42, 498, 81, 539, 963, 184, 899, 414, 313, 366, 582, 639, 148, 45, 87, 832, 823, 966, 296, 896, 696, 848,
            486, 269, 799, 970, 253, 550, 571, 349, 252, 518, 373, 680, 16, 388, 869, 196, 197, 533, 513, 599, 61, 762, 326, 281, 733, 726, 858, 89,
            669, 943, 747, 26, 143, 452, 546, 387, 15, 116, 575, 7, 958, 157, 390, 491, 347, 591, 73, 528, 481, 852, 996, 642, 422, 35, 838, 26, 736,
            877, 670, 434, 612, 805, 622, 442, 392, 124, 210, 792, 327, 686, 693, 933, 425, 189, 943, 325, 685, 612, 183, 554, 571, 113, 582, 804,
            573, 176, 178, 786, 854, 675, 774, 778, 512, 2, 492, 50, 709, 423, 421, 571, 999, 292, 376, 565, 506, 882, 131, 173, 210, 115, 604, 209,
            492, 629, 387, 773, 259, 260, 695, 229, 448, 186, 295, 941, 388, 711, 205, 952, 593, 903, 994, 713, 775, 59, 342, 872, 517, 302, 83, 76,
            853, 434, 363, 728, 178, 541, 673, 624, 313, 751, 479, 477, 261, 964, 883, 364, 189, 354, 232, 260, 408, 913, 911, 949, 696, 361, 584,
            769, 134, 257, 8, 833, 721, 293, 178, 626, 444, 313, 950, 93, 139, 783, 491, 659, 442, 116, 873, 937, 353, 447, 866, 202, 468, 222, 551,
            146, 719, 226, 630, 797, 547, 481, 476, 949, 784, 775, 778, 937, 189, 484, 331, 87, 465, 694, 951, 709, 820, 613, 706, 83, 611, 694, 669,
            488, 375, 891, 161, 947, 587, 997, 48, 43, 854, 73, 964, 843, 801, 541, 477, 697, 864, 672, 132, 457, 328, 806, 968, 409, 427, 855, 594,
            83, 48, 332, 162, 917, 605, 404, 589, 662, 946, 235, 210, 312, 717, 187, 643, 302, 504, 301, 995, 683, 181, 822, 727, 9, 323, 461, 426,
            692, 275, 485, 428, 654, 399, 724, 779, 236, 347, 44, 259, 411, 711, 879, 297, 551, 253, 971, 421, 184, 26, 533, 526, 393, 74, 708, 647,
            775, 93, 297, 118, 187, 379, 450, 953, 784, 616, 206, 59, 256, 587, 515, 400, 515, 688, 655, 559, 520, 193, 751, 230, 374, 584, 453, 65,
            286, 915, 684, 938, 526, 73, 789, 129, 18, 31, 319, 173, 805, 663, 179, 91, 206, 445, 820, 523, 138, 440, 727, 823, 719, 271, 477, 565,
            984, 407, 236, 974, 266, 972, 685, 757, 540, 483, 21, 469, 851, 325, 842, 24, 724, 579, 458, 216, 346, 765, 388, 146, 178, 406, 611, 255,
            555, 885, 404, 281, 811, 919, 483, 805, 415, 123, 478, 229, 621, 571, 727, 959, 194, 931, 765, 286, 804, 782, 861, 968, 829, 950, 450,
            776, 409, 268, 327, 363, 771, 985, 35, 624, 42, 168, 943, 373, 982, 817, 162, 549, 362, 110, 569, 362, 941, 121, 894, 747, 390, 621, 59,
            270, 807, 47, 662, 134, 872, 569, 812, 262, 115, 231, 308, 527, 201, 510, 481, 74, 617, 286, 921, 334, 662, 132, 668, 770, 173, 42, 409,
            619, 993, 188, 668, 886, 799, 89, 985, 632, 518, 585, 571, 178, 263, 388, 33, 148, 363, 534, 300, 460, 855, 6, 24, 223, 496, 932, 392,
            235, 205, 239, 424, 205, 612, 368, 594, 110, 291, 675, 807, 103, 99, 437, 587, 210, 992, 976, 586, 662, 600, 248, 407, 57, 851, 412, 74,
            735, 928, 302, 380, 653, 885, 432, 807, 809, 320, 147, 627, 719, 604, 814, 323, 775, 307, 465, 479, 337, 606, 172, 839, 297, 691, 507,
            339, 440, 370, 857, 512, 367, 378, 32, 831, 900, 138, 540, 236, 906, 87, 169, 289, 165, 4, 7, 159, 502, 170, 841, 909, 677, 605, 955,
            356, 627, 70, 692, 125, 550, 18, 825, 367, 948, 141, 647, 34, 215, 768, 955, 519, 557, 864, 538, 925, 21, 58, 585, 246, 239, 692, 442,
            237, 996, 607, 508, 828, 113, 36, 646, 511, 267, 726, 391, 256, 242, 152, 403, 149, 832, 504, 64, 152, 68, 911, 878, 49, 680, 247, 298,
            950, 773, 741, 964, 432, 468, 526, 869, 762, 891, 204, 850, 430, 233, 490, 938, 636, 799, 0, 528, 241, 865, 300, 29, 136, 914, 375, 636,
            940, 301, 828, 150, 444, 694, 197, 294, 226, 681, 991, 828, 418, 811, 209, 855, 716, 922, 354, 112, 305, 62, 202, 721, 562, 442, 878,
            805, 40, 895, 118, 637, 484, 3, 941, 484, 338, 631, 339, 124, 522, 900, 20, 77, 2, 730, 662, 963, 81, 961, 646, 41, 152, 711, 710, 888,
            80, 89, 530, 420, 314, 559, 798, 892, 271, 312, 971, 324, 552, 721, 488, 823, 52, 569, 940, 608, 98, 51, 350, 158, 332, 699, 461, 789,
            160, 276, 686, 138, 268, 362, 166, 495, 851, 861, 199, 653, 940, 859, 159, 958, 442, 345, 898, 552, 284, 78, 567, 365, 363, 511, 698,
            285, 836, 35, 400, 77, 653, 980, 512, 28, 128, 735, 609, 21, 803, 82, 808, 717, 773, 326, 461, 776, 179, 98, 898, 636, 579, 767, 620,
            143, 460, 225, 463, 482, 249, 482, 552, 237, 802, 848, 63, 53, 481, 727, 145, 384, 644, 991, 645, 983, 536, 639, 659, 357, 369, 22, 286,
            178, 598, 183, 400, 735, 250, 972, 696, 862, 478, 492, 732, 427, 372, 57, 218, 392, 494, 294, 320, 636, 481, 263, 341, 259, 583, 418,
            722, 805, 938, 80, 965, 930, 959, 595, 711, 336, 230, 738, 942, 440, 902, 29, 965, 96, 727, 539, 630, 898, 463, 456, 990, 22, 621, 142,
            469, 314, 189, 674, 415, 338, 248, 885, 840, 408, 147, 747, 33, 186, 219, 503, 697, 317, 846, 383, 222, 690, 75, 833, 739, 346, 849, 183,
            614, 756, 383, 357, 122, 188, 155, 749, 160, 124, 480, 679, 957, 266, 666, 869, 944, 475, 299, 286, 108, 110, 296, 251, 403, 619, 974,
            189, 45, 920, 553, 531, 807, 41, 159, 285, 744, 743, 647, 521, 146, 365, 258, 556, 895, 907, 451, 937, 794, 491, 5, 429, 933, 630, 872,
            52, 577, 464, 83, 917, 618, 961, 456, 21, 135, 347, 733, 370, 203, 475, 292, 844, 692, 638, 524, 945, 408, 358, 522, 180, 627, 16, 758,
            142, 737, 816, 44, 498, 463, 444, 160, 996, 868, 959, 197, 279, 162, 934, 838, 785, 129, 562, 522, 245, 851, 483, 665, 335, 316, 381, 895,
            838, 354, 980, 558, 288, 356, 916, 606, 419, 167, 125, 314, 919, 560, 794, 205, 914, 754, 627, 975, 346, 486, 176, 172, 873, 279, 232,
            889, 251, 647, 848, 734, 174, 177, 360, 922, 431, 592, 914, 393, 833, 168, 383, 507, 800, 83, 232, 983, 657, 616, 840, 473, 682, 404, 34,
            320, 695, 337, 106, 849, 485, 29, 356, 763, 730, 259, 325, 70, 116, 173, 212, 252, 265, 553, 614, 304, 727, 965, 667, 640, 738, 101, 848,
            805, 644, 260, 209, 386, 938, 457, 545, 521, 570, 330, 93, 921, 837, 653, 641, 367, 417, 953, 565, 260, 320, 501, 200, 875, 363, 637,
            114, 671, 527, 251, 319, 149, 975, 1, 179, 473, 790, 750, 796, 333, 511, 552, 961, 269, 373, 465, 316, 9, 724, 371, 254, 196, 505, 19,
            214, 244, 796, 456, 451, 993, 414, 97, 78, 202, 222, 731, 138, 964, 344, 867, 753, 532, 758, 971, 940, 148, 772, 287, 503, 962, 783, 151,
            524, 258, 299, 930, 390, 794, 648, 966, 916, 222, 943, 207, 141, 247, 900, 533, 550, 367, 798, 110, 41, 820, 440, 528, 710, 585, 285,
            862, 645, 149, 984, 256, 260, 38, 477, 104, 330, 13, 422, 415, 846, 213, 197, 483, 981, 459, 914, 552, 955, 409, 893, 789, 354, 224, 836,
            472, 513, 955, 485, 14, 881, 893, 908, 96, 918, 733, 675, 947, 966, 497, 105, 527, 672, 833, 429, 209, 60, 478, 214, 325, 22, 380, 618,
            839, 42, 223, 107, 253, 280, 879, 29, 813, 687, 601, 108, 978, 709, 625, 219, 132, 274, 202, 26, 511, 162, 0, 951, 350, 599, 214, 717,
            357, 859, 727, 153, 671, 947, 124, 269, 658, 991, 390, 663, 4, 784, 703, 155, 812, 27, 790, 192, 592, 234, 945, 949, 332, 914, 963, 261,
            99, 603, 915, 471, 950, 565, 904, 63, 292, 490, 690, 428, 209, 297, 336, 485, 678, 280, 844, 926, 64, 127, 79, 754, 745, 44, 153, 436,
            229, 100, 835, 433, 675, 135, 481, 69, 286, 39, 460, 748, 659, 9, 15, 250, 802, 388, 40, 454, 194, 75, 318, 146, 963, 63, 328, 717, 989, 580, 866, 442, 478, 459, 371, 747, 371, 842, 23, 313, 754, 32, 387, 137, 292, 347, 646, 692, 598, 112, 202, 142, 351, 507, 759, 174, 951, 862, 833, 364, 432, 108, 986, 169, 410, 537, 9, 574, 850, 729, 682, 131, 526, 454, 714, 635, 133, 685, 965, 978, 164, 340, 62, 752, 816, 254, 80, 48, 391, 958, 68, 522, 878, 246, 780, 172, 676, 186, 142, 511, 696, 183, 689, 740, 391, 933, 353, 320, 657, 631, 813, 831, 867, 586, 803, 369, 790, 480, 658, 770, 516, 872, 657, 880, 62, 179, 629, 709, 770, 301, 659, 762, 210, 246, 679, 66, 833, 615, 193, 386, 232, 560, 363, 944, 515, 878, 212, 476, 934, 237, 776, 852, 641, 140, 589, 565, 139, 116, 32, 341, 786, 819, 720, 773, 458, 143, 255, 401, 355, 224, 444, 846, 732, 195, 250, 711, 246, 871, 585, 705, 544, 115, 312, 98, 607, 499, 692, 959, 415, 4, 854, 789, 442, 956, 794, 118, 569, 53, 803, 324, 67, 366, 231, 471, 391, 449, 945, 206, 674, 219, 882, 852, 970, 139, 674, 653, 495, 313, 352, 771, 334, 492, 828, 36, 344, 708, 938, 629, 283, 135, 551, 866, 508, 85, 442, 990, 922, 508, 379, 407, 275, 189, 140, 133, 290, 920, 990, 286, 574, 256, 482, 362, 713, 140, 306, 677, 501, 584, 331, 783, 750, 801, 888, 921, 727, 666, 820, 535, 869, 170, 826, 676, 34, 536, 125, 694, 236, 54, 549, 934, 506, 243, 740, 312, 229, 881, 259, 521, 97, 610, 54, 333, 573, 243, 922, 916, 613, 697, 307, 341, 224, 434, 20, 486, 335, 615, 242, 367, 362, 772, 485, 491, 801, 607, 3, 243, 150, 737, 530, 449, 499, 564, 123, 196, 113, 206, 299, 722, 474, 369, 643, 685, 281, 331, 536, 399, 99, 751, 689, 684, 470, 837, 718, 847, 522, 536, 82, 890, 328, 773, 335, 511, 532, 472, 774, 581, 33, 11, 262, 820, 866, 32, 204, 91, 754, 19, 417, 290, 182, 858, 871, 130, 281, 698, 144, 178, 237, 747, 696, 423, 427, 318, 11, 279, 992, 353, 991, 377, 93, 831, 966, 718, 670, 5, 105, 767, 129, 110, 46, 832, 10, 307, 50, 657, 360, 885, 69, 490, 225, 421, 688, 18, 410, 421, 19, 454, 410, 209, 292, 786, 204, 217, 44, 614, 425, 626, 537, 311, 282, 268, 275, 215, 477, 42, 254, 437, 287, 661, 903, 404, 928, 382, 498, 677, 277, 564, 197, 714, 74, 270, 757, 206, 723, 869, 415, 313, 905, 563, 367, 648, 334, 35, 801, 129, 80, 952, 438, 876, 81, 919, 94, 196, 657, 529, 880, 300, 49, 626, 255, 817, 293, 488, 315, 366, 998, 661, 353, 388, 945, 366, 979, 235, 763, 926, 790, 991, 316, 487, 888, 872, 872, 334, 318, 93, 546, 515, 872, 9, 3, 91, 534, 957, 911, 276, 273, 707, 171, 919, 797, 601, 528, 272, 372, 499, 766, 764, 754, 421, 322, 525, 876, 321, 824, 762, 918, 807, 755, 677, 20, 714, 157, 514, 1, 362, 78, 508, 98, 20, 222, 941, 916, 562, 106, 266, 502, 540, 866, 264, 676, 969, 764, 492, 573, 877, 308, 888, 592, 326, 923, 221, 840, 939, 5, 231, 500, 149, 265, 754, 451, 327, 270, 773, 922, 649, 182, 381, 879, 74, 777, 872, 390, 95, 983, 729, 203, 963, 327, 127, 333, 958, 878, 647, 546, 891, 506, 322, 257, 428, 528, 781, 471, 14, 117, 235, 133, 169, 143, 255, 410, 629, 508, 852, 201, 396, 383, 112, 449, 26, 182, 770, 612, 615, 582, 434, 14, 782, 313, 819, 628, 650, 31, 291, 301, 219, 49, 192, 288, 778, 332, 939, 496, 993, 730, 624, 766, 80, 74, 918, 111, 50, 406, 390, 826, 358, 343, 968, 2, 399, 265, 174, 101, 215, 805, 916, 875, 459, 882, 84, 109, 139, 382, 951, 372, 909, 383, 349, 216, 699, 765, 946, 18, 310, 924, 484, 976, 186, 264, 725, 623, 929, 118, 967, 546, 320, 768, 460, 952, 521, 263, 694, 115, 845, 795, 581, 708, 23, 534, 765, 537, 122, 902, 879, 175, 386, 488, 378, 614, 73, 951, 698, 65, 23, 530, 869, 718, 65, 995, 395, 392, 591, 212, 176, 684, 576, 769, 448, 449, 76, 493, 278, 188, 766, 64, 910, 182, 417, 340, 373, 26, 264, 465, 84, 554, 127, 301, 851, 5, 801, 228, 600, 694, 640, 926, 328, 371, 522, 277, 305, 911, 356, 169, 294, 987, 71, 600, 606, 882, 614, 141, 147, 673, 806, 525, 205, 582, 45, 852, 653, 430, 739, 647, 359, 774, 56, 824, 119, 466, 42, 399, 94, 128, 392, 683, 810, 229, 229, 526, 27, 274, 14, 142, 401, 879, 349, 965, 700, 372, 765, 968, 488, 906, 796, 887, 599, 1, 531, 842, 459, 811, 580, 898, 254, 441, 897, 225, 249, 64, 159, 660, 92, 665, 495, 605, 762, 769, 176, 435, 947, 598, 527, 774, 9, 731, 703, 301, 387, 475, 190, 989, 229, 862, 835, 50, 273, 351, 971, 168, 546, 127, 740, 20, 200, 84, 28, 480, 931, 458, 501, 357, 746, 358, 148, 979, 519, 340, 353, 479, 673, 565, 980, 136, 550, 2, 169, 725, 498, 607, 539, 426, 487, 408, 283, 461, 99, 933, 191, 325, 83, 490, 3, 130, 254, 389, 591, 356, 434, 311, 407, 15, 279, 685, 299, 68, 311, 107, 276, 714, 187, 552, 56, 66, 295, 381, 260, 571, 1, 897, 926, 476, 513, 524, 620, 582, 157, 540, 785, 480, 992, 611, 144, 524, 149, 331, 883, 783, 941, 356, 97, 308, 817, 720, 447, 167, 467, 382, 284, 806, 949, 101, 547, 478, 541, 276, 586, 674, 109, 490, 701, 711, 220, 98, 566, 906, 835, 358, 940, 37, 435, 297, 985, 127, 637, 679, 305, 930, 859, 230, 333, 888, 443, 518, 999, 750, 656, 706, 726, 457, 410, 721, 667, 433, 141, 272, 749, 864, 245, 520, 531, 144, 631, 161, 117, 202, 477, 127, 338, 40, 28, 106, 230, 446, 299, 625, 368, 511, 922, 454, 988, 273, 932, 732, 945, 535, 239, 278, 444, 671, 636, 244, 206, 23, 726, 423, 163, 301, 802, 234, 66, 277, 812, 681, 371, 901, 773, 309, 639, 953, 619, 533, 242, 210, 309, 513, 549, 150, 167, 154, 934, 187, 854, 669, 886, 494, 60, 616, 201, 509, 17, 240, 765, 371, 173, 486, 698, 617, 925, 29, 705, 665, 149, 264, 313, 807, 357, 266, 315, 637, 717, 334, 132, 125, 829, 922, 1, 830, 135, 395, 878, 56, 25, 299, 665, 121, 281, 546, 934, 285, 241, 217, 626, 302, 183, 466, 275, 8, 764, 369, 229, 820, 21, 399, 935, 566, 320, 656, 868, 552, 890, 854, 829, 399, 28, 571, 395, 747, 850, 247, 53, 569, 500, 939, 135, 512, 60, 895, 990, 363, 15, 600, 988, 471, 23, 75, 828, 729, 905, 829, 328, 477, 228, 82, 339, 549, 589, 569, 680, 506, 728, 469, 13, 996, 892, 803, 403, 106, 439, 929, 897, 487, 574, 609, 833, 45, 184, 490, 736, 985, 225, 736, 630, 17, 786, 983, 262, 650, 932, 756, 290, 548, 732, 961, 731, 98, 382, 114, 41, 483, 194, 511, 54, 761, 316, 630, 609, 668, 446, 667, 125, 123, 480, 292, 565, 725, 964, 336, 182, 808, 502, 385, 230, 32, 734, 961, 309, 802, 338, 280, 363, 300, 567, 337, 426, 288, 205, 458, 94, 368, 447, 282, 356, 871, 167, 566, 847, 94, 196, 110, 831, 173, 767, 595, 193, 480, 999, 82, 518, 75, 388, 474, 893, 400, 567, 290, 426, 95, 229, 665, 569, 565, 978, 662, 286, 656, 78, 560, 749, 606, 477, 27, 751, 262, 277, 759, 251, 391, 773, 427, 516, 812, 546, 538, 126, 977, 618, 133, 706, 587, 575, 73, 635, 805, 698, 36, 123, 628, 540, 244, 988, 28, 136, 375, 212, 545, 967, 76, 804, 102, 119, 975, 835, 981, 578, 138, 532, 7, 457, 445, 195, 253, 64, 468, 290, 741, 94, 35, 526, 919, 912, 835, 856, 961, 858, 74, 377, 270, 713, 415, 777, 897, 2, 200, 601, 10, 618, 177, 822, 916, 291, 814, 391, 621, 832, 576, 247, 376, 694, 445, 959, 165, 321, 334, 606, 637, 965, 983, 712, 543, 140, 411, 65, 365, 630, 949, 16, 434, 39, 448, 449, 503, 185, 266, 900, 457, 255, 278, 505, 541, 531, 208, 295, 273, 663, 303, 84, 967, 934, 473, 660, 657, 676, 810, 226, 16, 36, 570, 85, 784, 568, 541, 372, 116, 721, 965, 226, 226, 138, 83, 173, 638, 851, 671, 665, 431, 843, 901, 615, 838, 174, 233, 548, 672, 856, 64, 436, 136, 919, 286, 592, 725, 660, 3, 65, 72, 892, 143, 810, 790, 137, 847, 538, 615, 77, 89, 561, 383, 267, 164, 132, 666, 50, 336, 755, 242, 880, 174, 676, 899, 730, 821, 327, 457, 109, 744, 771, 329, 256, 292, 324, 365, 448, 740, 389, 214, 21, 373, 193, 941, 585, 539, 568, 184, 160, 552, 127, 697, 420, 785, 184, 730, 8, 275, 567, 346, 921, 693, 16, 412, 328, 601, 207, 726, 730, 469, 586, 444, 344, 95, 86, 750, 687, 664, 482, 501, 854, 912, 643, 369, 672, 534, 148, 911, 965, 253, 801, 822, 431, 707, 365, 585, 238, 647, 455, 660, 293, 748, 884, 325, 272, 737, 936, 311, 945, 405, 947, 391, 13, 522, 329, 175, 663, 640, 657, 445, 328, 239, 707, 519, 668, 727, 432, 271, 625, 331, 663, 668, 521, 13, 1, 871, 553, 191, 712, 240, 704, 130, 681, 845, 71, 626, 423, 441, 807, 751, 890, 165, 422, 221, 382, 668, 980, 186, 137, 729, 788, 66, 317, 923, 560, 399, 942, 324, 672, 512, 6, 789, 28, 250, 435, 870, 293, 918, 790, 985, 712, 40, 570, 93, 508, 571, 815, 735, 896, 665, 217, 974, 84, 220, 328, 470, 244, 952, 570, 638, 314, 916, 639, 614, 691, 995, 622, 534, 292, 107, 587, 447, 233, 548, 654, 52, 370, 165, 621, 316, 247, 802, 983, 951, 582, 797, 828, 686, 275, 106, 425, 220, 71, 36, 512, 786, 423, 450, 204, 263, 813, 732, 179, 862, 781, 779, 284, 526, 152, 763, 14, 277, 532, 449, 332, 957, 955, 384, 205, 976, 659, 396, 797, 910, 410, 417, 708, 64, 399, 833, 824, 393, 750, 221, 302, 497, 874, 543, 980, 771, 443, 636, 35, 146, 541, 76, 1, 315, 636, 332, 399, 735, 381, 433, 48, 218, 879, 271, 847, 407, 986, 34, 192, 965, 422, 209, 482, 925, 947, 56, 89, 173, 618, 437, 30, 756, 215, 434, 78, 296, 215, 198, 435, 546, 339, 120, 184, 811, 574, 477, 684, 741, 734, 390, 716, 774, 101, 100, 694, 354, 405, 278, 476, 862, 422, 333, 378, 132, 774, 457, 763, 292, 87, 436, 219, 639, 523, 127, 671, 246, 848, 832, 966, 979, 621, 721, 388, 666, 783, 877, 283, 208, 932, 513, 480, 568, 806, 377, 470, 640, 76, 422, 374, 240, 354, 328, 576, 590, 446, 602, 513, 955, 274, 552, 532, 286, 543, 613, 916, 84, 212, 173, 126, 958, 41, 251, 100, 736, 17, 134, 932, 372, 242, 355, 605, 292, 972, 182, 538, 282, 826, 150, 569, 483, 856, 21, 668, 591, 61, 947, 108, 872, 156, 577, 46, 197, 886, 264, 448, 883, 933, 560, 107, 789, 521, 690, 38, 742, 153, 761, 886, 100, 514, 47, 126, 972, 492, 795, 704, 361, 391, 685, 510, 316, 932, 202, 481, 969, 313, 950, 441, 209, 650, 123, 781, 616, 408, 172, 900, 194, 11, 980, 942, 395, 679, 711, 720, 897, 685, 853, 875, 614, 649, 898, 282, 445, 179, 496, 393, 352, 167, 928, 751, 458, 318, 186, 159, 980, 13, 21, 71, 989, 466, 838, 604, 179, 232, 422, 207, 49, 506, 95, 417, 185, 345, 53, 340, 580, 882, 308, 442, 285, 849, 882, 999, 28, 231, 625, 96, 803, 679, 333, 345, 877, 390, 610, 641, 85, 514, 293, 84, 772, 804, 94, 919, 242, 121, 540, 732, 128, 649, 198, 390, 647, 121, 656, 202, 333, 161, 712, 570, 444, 850, 739, 937, 937, 4, 284, 230, 571, 222, 487, 63, 450, 671, 100, 933, 57, 753, 460, 279, 635, 232, 4, 775, 586, 160, 602, 469, 409, 946, 235, 414, 588, 190, 316, 243, 752, 536, 249, 746, 370, 590, 689, 887, 240, 151, 287, 817, 18, 385, 653, 453, 80, 304, 653, 822, 97, 866, 167, 948, 779, 325, 880, 292, 393, 950, 737, 845, 835, 111, 238, 806, 198, 822, 825, 406, 58, 202, 256, 845, 896, 29, 979, 516, 422, 482, 226, 610, 854, 417, 748, 21, 561, 31, 852, 923, 876, 585, 686, 777, 294, 906, 509, 554, 706, 770, 31, 896, 813, 910, 786, 555, 364, 303, 857, 897, 404, 604, 272, 483, 288, 72, 777, 750, 829, 119, 753, 566, 556, 628, 509, 28, 763, 549, 288, 201, 685, 868, 875, 632, 897, 951, 833, 355, 764, 430, 40, 833, 592, 247, 367, 720, 914, 231, 72, 578, 223, 560, 708, 739, 349, 799, 125, 301, 570, 764, 460, 822, 521, 307, 823, 708, 913, 299, 785, 370, 119, 473, 651, 249, 682, 511, 934, 448, 912, 739, 429, 267, 810, 75, 740, 204, 705, 383, 181, 25, 162, 278, 500, 388, 896, 473, 962, 106, 669, 193, 958, 553, 404, 838, 463, 892, 39, 33, 303, 805, 957, 441, 468, 103, 193, 222, 398, 189, 2, 838, 462, 612, 776, 962, 670, 59, 746, 622, 968, 24, 405, 345, 352, 29, 62, 9, 435, 716, 504, 271, 23, 359, 295, 986, 727, 335, 873, 733, 631, 870, 189, 673, 543, 966, 363, 238, 449, 726, 461, 812, 327, 440, 284, 405, 647, 704, 769, 545, 490, 513, 432, 22, 429, 771, 77, 887, 7, 876, 859, 103, 915, 93, 674, 559, 704, 240, 761, 723, 229, 798, 344, 86, 804, 938, 125, 670, 459, 113, 450, 323, 550, 800, 998, 198, 452, 709, 931, 824, 967, 249, 526, 424, 629, 359, 467, 701, 80, 847, 118, 131, 249, 243, 310, 898, 163, 776, 389, 47, 835, 525, 549, 30, 817, 953, 743, 852, 687, 14, 800, 199, 966, 779, 730, 471, 680, 43, 574, 455, 72, 720, 565, 421, 785, 880, 845, 801, 134, 210, 415, 267, 11, 295, 544, 906, 304, 586, 366, 451, 701, 117, 11, 942, 164, 45, 164, 43, 379, 881, 635, 195, 3, 817, 136, 198, 588, 916, 205, 369, 640, 64, 904, 343, 407, 467, 711, 741, 621, 192, 782, 399, 601, 699, 614, 570, 860, 571, 970, 549, 570, 688, 818, 433, 26, 882, 945, 362, 572, 739, 874, 384, 256, 553, 655, 287, 882, 625, 145, 112, 4, 19, 410, 815, 844, 612, 954, 488, 90, 779, 600, 841, 1, 343, 960, 186, 281, 455, 608, 6, 756, 954, 267, 264, 940, 350, 548, 65, 232, 998, 22, 879, 597, 211, 727, 555, 303, 40, 504, 546, 472, 177, 926, 305, 954, 11, 958, 596, 300, 127, 912, 567, 445, 677, 685, 744, 995, 912, 787, 816, 943, 809, 121, 931, 987, 187, 64, 488, 580, 915, 941, 848, 300, 812, 598, 196, 119, 626, 412, 795, 670, 53, 742, 225, 677, 74, 514, 808, 290, 50, 374, 310, 191, 881, 585, 176, 985, 276, 654, 16, 569, 585, 479, 801, 887, 963, 658, 228, 721, 614, 514, 26, 933, 708, 254, 552, 906, 151, 688, 866, 733, 747, 854, 660, 93, 489, 941, 783, 655, 601, 930, 855, 269, 722, 444, 428, 165, 87, 400, 404, 895, 871, 192, 10, 747, 898, 294, 412, 942, 791, 386, 191, 987, 235, 297, 285, 208, 460, 367, 678, 603, 215, 71, 56, 848, 495, 106, 919, 521, 20, 477, 111, 312, 995, 502, 563, 296, 16, 76, 109, 140, 49, 987, 592, 443, 311, 530, 122, 291, 527, 206, 286, 501, 479, 803, 277, 957, 980, 757, 438, 902, 415, 265, 451, 58, 757, 267, 467, 941, 552, 99, 790, 838, 690, 277, 350, 436, 913, 628, 86, 286, 935, 734, 524, 878, 703, 445, 312, 294, 826, 41, 178, 153, 445, 469, 833, 753, 834, 970, 587, 132, 855, 325, 89, 45, 976, 903, 399, 718, 935, 647, 786, 588, 286, 178, 47, 144, 23, 206, 863, 413, 172, 530, 669, 611, 749, 990, 802, 936, 783, 897, 236, 562, 135, 600, 31, 379, 713, 72, 753, 176, 307, 606, 480, 533, 649, 979, 733, 877, 542, 737, 565, 795, 809, 558, 331, 954, 624, 30, 137, 684, 272, 527, 799, 578, 728, 326, 180, 260, 534, 512, 188, 802, 307, 729, 297, 158, 908, 314, 438, 356, 705, 922, 260, 156, 598, 297, 279, 295, 475, 452, 178, 490, 552, 173, 596, 834, 602, 384, 37, 341, 441, 672, 174, 915, 139, 925, 687, 195, 367, 856, 978, 339, 942, 932, 522, 10, 133, 84, 382, 524, 509, 396, 416, 390, 190, 874, 3, 202, 117, 308, 691, 203, 598, 174, 55, 626, 752, 526, 143, 328, 599, 797, 380, 100, 545, 521, 429, 487, 656, 7, 567, 905, 684, 131, 335, 339, 46, 539, 820, 926, 30, 707, 719, 288, 369, 525, 479, 560, 910, 270, 159, 688, 555, 109, 371, 706, 804, 571, 593, 392, 223, 727, 375, 918, 902, 175, 491, 835, 496, 335, 887, 33, 762, 939, 333, 94, 607, 63, 81, 830, 517, 539, 439, 610, 910, 64, 123, 554, 392, 895, 428, 522, 121, 560, 764, 358, 459, 645, 854, 797, 914, 331, 956, 984, 896, 31, 782, 607, 195, 164, 408, 248, 184, 843, 363, 629, 667, 2, 244, 152, 997, 281, 679, 226, 527, 808, 169, 677, 738, 877, 392, 691, 399, 390, 805, 589, 945, 857, 999, 994, 836, 699, 108, 803, 51, 557, 700, 734, 13, 343, 26, 148, 208, 789, 193, 223, 431, 333, 805, 579, 156, 280, 912, 903, 750, 307, 608, 159, 357, 554, 503, 539, 95, 732, 353, 375, 862, 902, 564, 867, 419, 856, 932, 617, 644, 305, 946, 659, 792, 393, 224, 865, 361, 448, 142, 369, 697, 204, 555, 914, 772, 200, 546, 831, 684, 480, 523, 710, 282, 185, 631, 676, 991, 178, 342, 591, 346, 330, 318, 427, 963, 715, 117, 526, 680, 523, 70, 449, 374, 172, 717, 642, 534, 737, 514, 206, 8, 513, 139, 633, 472, 282, 601, 514, 77, 574, 548, 840, 402, 37, 614, 727, 347, 826, 377, 92, 812, 799, 534, 52, 53, 160, 165, 605, 449, 139, 576, 432, 950, 212, 39, 524, 906, 376, 906, 691, 113, 963, 995, 906, 835, 560, 840, 880, 319, 634, 397, 222, 774, 590, 52, 15, 115, 119, 340, 696, 793, 840, 583, 649, 915, 469, 810, 36, 446, 938, 675, 976, 732, 176, 773, 384, 739, 551, 730, 392, 385, 255, 629, 552, 102, 335, 917, 725, 280, 390, 670, 845, 571, 406, 218, 558, 117, 644, 472, 60, 660, 964, 945, 345, 114, 477, 364, 457, 658, 968, 16, 267, 603, 93, 391, 789, 294, 962, 527, 999, 88, 351, 437, 681, 25, 453, 395, 856, 122, 766, 405, 952, 399, 464, 123, 986, 588, 328, 631, 674, 223, 131, 956, 570, 243, 168, 922, 53, 504, 493, 975, 207, 621, 305, 896, 434, 395, 828, 908, 929, 635, 992, 531, 998, 611, 192, 699, 545, 484, 408, 64, 985, 34, 18, 106, 242, 705, 697, 683, 477, 492, 910, 887, 649, 483, 620, 646, 93, 927, 24, 333, 790, 542, 306, 743, 137, 416, 634, 206, 632, 237, 875, 271, 22, 796, 807, 346, 163, 684, 923, 921, 45, 822, 265, 506, 181, 29, 126, 241, 818, 129, 858, 172, 262, 199, 477, 589, 926, 430, 245, 432, 570, 739, 889, 724, 634, 700, 683, 155, 462, 582, 190, 468, 694, 301, 35, 33, 91, 838, 753, 68, 590, 284, 392, 260, 425, 972, 260, 200, 765, 329, 930, 885, 393, 943, 371, 750, 664, 59, 879, 132, 88, 178, 278, 798, 654, 682, 737, 209, 226, 448, 420, 455, 124, 206, 106, 406, 298, 29, 854, 472, 362, 679, 783, 500, 103, 713, 28, 775, 988, 192, 977, 773, 616, 538, 978, 336, 42, 609, 788, 155, 366, 326, 184, 47, 24, 251, 320, 299, 778, 378, 599, 495, 456, 999, 71, 606, 165, 926, 612, 815, 789, 554, 455, 497, 314, 183, 924, 10, 712, 810, 614, 459, 850, 99, 624, 420, 190, 572, 869, 655, 832, 158, 941, 237, 787, 89, 468, 134, 263, 829, 441, 223, 97, 126, 484, 917, 456, 506, 669, 57, 343, 548, 11, 511, 454, 32, 488, 952, 475, 633, 24, 616, 933, 177, 624, 470, 314, 597, 545, 80, 296, 638, 164, 680, 567, 42, 978, 366, 887, 429, 15, 81, 790, 312, 755, 92, 517, 754, 581, 937, 595, 963, 665, 400, 749, 705, 154, 954, 682, 842, 500, 218, 635, 389, 779, 438, 512, 480, 890, 672, 833, 329, 596, 356, 673, 768, 464, 209, 313, 238, 910, 957, 280, 167, 705, 201, 81, 514, 497, 868, 950, 887, 145, 62, 616, 46, 898, 813, 186, 787, 760, 180, 966, 193, 700, 384, 227, 954, 704, 185, 682, 25, 71, 499, 690, 186, 761, 335, 52, 163, 37, 487, 552, 855, 144, 75, 300, 848, 264, 930, 315, 873, 514, 31, 719, 42, 356, 699, 394, 725, 355, 991, 904, 703, 896, 823, 64, 802, 79, 645, 545, 547, 775, 117, 521, 506, 494, 135, 468, 915, 519, 712, 879, 836, 511, 681, 849, 588, 654, 923, 165, 449, 219, 838, 822, 637, 341, 80, 632, 403, 706, 147, 894, 677, 790, 273, 960, 55, 265, 244, 872, 100, 218, 131, 148, 850, 841, 680, 249, 153, 335, 72, 181, 956, 877, 10, 225, 942, 626, 681, 771, 983, 912, 929, 816, 727, 937, 112, 757, 245, 580, 492, 738, 90, 98, 690, 958, 299, 872, 692, 11, 836, 609, 111, 573, 733, 804, 954, 466, 716, 634, 912, 413, 410, 863, 303, 608, 322, 806, 110, 559, 666, 855, 266, 520, 759, 593, 178, 249, 160, 50, 774, 743, 924, 243, 762, 59, 367, 730, 614, 343, 511, 544, 808, 699, 929, 546, 199, 579, 79, 921, 996, 991, 330, 284, 714, 892, 772, 602, 654, 843, 635, 944, 898, 130, 558, 884, 557, 287, 248, 244, 22, 225, 68, 728, 266, 890, 921, 938, 824, 742, 394, 198, 930, 123, 488, 570, 458, 7, 437, 505, 695, 479, 38, 547, 724, 745, 650, 644, 142, 431, 507, 662, 128, 424, 286, 889, 415, 525, 915, 434, 550, 750, 485, 648, 937, 194, 705, 916, 553, 997, 806, 428, 887, 94, 927, 822, 627, 118, 47, 921, 839, 35, 222, 130, 896, 825, 458, 457, 235, 822, 845, 514, 73, 86, 680, 331, 585, 578, 179, 255, 702, 720, 28, 763, 570, 356, 488, 500, 972, 47, 946, 487, 446, 108, 855, 992, 633, 762, 743, 226, 424, 342, 557, 671, 806, 501, 961, 559, 917, 5, 312, 742, 714, 764, 955, 931, 829, 443, 168, 126, 634, 159, 557, 810, 294, 470, 955, 395, 580, 141, 896, 250, 515, 893, 570, 579, 531, 704, 748, 354, 628, 33, 535, 480, 222, 697, 990, 402, 740, 82, 561, 362, 777, 726, 22, 638, 555, 345, 98, 150, 747, 817, 243, 980, 249, 687, 86, 522, 301, 298, 943, 146, 504, 762, 372, 517, 636, 570, 190, 958, 860, 825, 539, 529, 878, 730, 576, 825, 793, 204, 92, 843, 3, 222, 913, 660, 186, 749, 245, 61, 583, 969, 221, 732, 93, 810, 771, 69, 365, 663, 622, 212, 973, 582, 639, 409, 996, 172, 967, 410, 776, 866, 414, 197, 409, 239, 310, 964, 579, 573, 637, 960, 663, 926, 566, 479, 643, 530, 667, 16, 271, 493, 963, 376, 79, 407, 694, 291, 305, 641, 116, 951, 526, 835, 913, 681, 808, 327, 10000};

    @BeforeAll
    public static void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    public void test01() {
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void test02() {
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
       assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    public void test03() {
//        Input: nums = [3,3], target = 6
//        Output: [0,1]
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{3, 3}, 6));
    }

    @Test
    public void test04() {
//        Input: nums = [2,5,5,11], target = 10
//        Output: [1,2]
       assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(new int[]{2, 5, 5, 11}, 10));
    }

    @Test
    public void test05() {
        assertArrayEquals(new int[]{0, 7486}, twoSum.twoSum(arr, 20000));
    }
}