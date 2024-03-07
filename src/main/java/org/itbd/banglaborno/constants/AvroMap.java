package org.itbd.banglaborno.constants;


public class AvroMap {
    private String avroMap = """
            {
              "data": {
                "classes": {
                  "vowel": "aeiou",
                  "consonant": "bcdfghjklmnpqrstvwxyz",
                  "casesensitive": "oiudgjnrstyz"
                },
                "patterns": {
                  "pattern": [
                    {
                      "find": "psh",
                      "replace": "পশ",
                      "rules": ""
                    },
                    {
                      "find": "bhl",
                      "replace": "ভ্ল",
                      "rules": ""
                    },
                    {
                      "find": "bdh",
                      "replace": "ব্ধ",
                      "rules": ""
                    },
                    {
                      "find": "bj",
                      "replace": "ব্জ",
                      "rules": ""
                    },
                    {
                      "find": "bd",
                      "replace": "ব্দ",
                      "rules": ""
                    },
                    {
                      "find": "bb",
                      "replace": "ব্ব",
                      "rules": ""
                    },
                    {
                      "find": "bl",
                      "replace": "ব্ল",
                      "rules": ""
                    },
                    {
                      "find": "bh",
                      "replace": "ভ",
                      "rules": ""
                    },
                    {
                      "find": "vl",
                      "replace": "ভ্ল",
                      "rules": ""
                    },
                    {
                      "find": "b",
                      "replace": "ব",
                      "rules": ""
                    },
                    {
                      "find": "v",
                      "replace": "ভ",
                      "rules": ""
                    },
                    {
                      "find": "cNG",
                      "replace": "চ্ঞ",
                      "rules": ""
                    },
                    {
                      "find": "cch",
                      "replace": "চ্ছ",
                      "rules": ""
                    },
                    {
                      "find": "cc",
                      "replace": "চ্চ",
                      "rules": ""
                    },
                    {
                      "find": "ch",
                      "replace": "ছ",
                      "rules": ""
                    },
                    {
                      "find": "c",
                      "replace": "চ",
                      "rules": ""
                    },
                    {
                      "find": "dhn",
                      "replace": "ধ্ন",
                      "rules": ""
                    },
                    {
                      "find": "dhm",
                      "replace": "ধ্ম",
                      "rules": ""
                    },
                    {
                      "find": "dgh",
                      "replace": "দ্ঘ",
                      "rules": ""
                    },
                    {
                      "find": "ddh",
                      "replace": "দ্ধ",
                      "rules": ""
                    },
                    {
                      "find": "dbh",
                      "replace": "দ্ভ",
                      "rules": ""
                    },
                    {
                      "find": "dv",
                      "replace": "দ্ভ",
                      "rules": ""
                    },
                    {
                      "find": "dm",
                      "replace": "দ্ম",
                      "rules": ""
                    },
                    {
                      "find": "DD",
                      "replace": "ড্ড",
                      "rules": ""
                    },
                    {
                      "find": "Dh",
                      "replace": "ঢ",
                      "rules": ""
                    },
                    {
                      "find": "dh",
                      "replace": "ধ",
                      "rules": ""
                    },
                    {
                      "find": "dg",
                      "replace": "দ্গ",
                      "rules": ""
                    },
                    {
                      "find": "dd",
                      "replace": "দ্দ",
                      "rules": ""
                    },
                    {
                      "find": "D",
                      "replace": "ড",
                      "rules": ""
                    },
                    {
                      "find": "d",
                      "replace": "দ",
                      "rules": ""
                    },
                    {
                      "find": "...",
                      "replace": "...",
                      "rules": ""
                    },
                    {
                      "find": ".`",
                      "replace": ".",
                      "rules": ""
                    },
                    {
                      "find": "..",
                      "replace": "।।",
                      "rules": ""
                    },
                    {
                      "find": ".",
                      "replace": "।",
                      "rules": ""
                    },
                    {
                      "find": "ghn",
                      "replace": "ঘ্ন",
                      "rules": ""
                    },
                    {
                      "find": "Ghn",
                      "replace": "ঘ্ন",
                      "rules": ""
                    },
                    {
                      "find": "gdh",
                      "replace": "গ্ধ",
                      "rules": ""
                    },
                    {
                      "find": "Gdh",
                      "replace": "গ্ধ",
                      "rules": ""
                    },
                    {
                      "find": "gN",
                      "replace": "গ্ণ",
                      "rules": ""
                    },
                    {
                      "find": "GN",
                      "replace": "গ্ণ",
                      "rules": ""
                    },
                    {
                      "find": "gn",
                      "replace": "গ্ন",
                      "rules": ""
                    },
                    {
                      "find": "Gn",
                      "replace": "গ্ন",
                      "rules": ""
                    },
                    {
                      "find": "gm",
                      "replace": "গ্ম",
                      "rules": ""
                    },
                    {
                      "find": "Gm",
                      "replace": "গ্ম",
                      "rules": ""
                    },
                    {
                      "find": "gl",
                      "replace": "গ্ল",
                      "rules": ""
                    },
                    {
                      "find": "Gl",
                      "replace": "গ্ল",
                      "rules": ""
                    },
                    {
                      "find": "gg",
                      "replace": "জ্ঞ",
                      "rules": ""
                    },
                    {
                      "find": "GG",
                      "replace": "জ্ঞ",
                      "rules": ""
                    },
                    {
                      "find": "Gg",
                      "replace": "জ্ঞ",
                      "rules": ""
                    },
                    {
                      "find": "gG",
                      "replace": "জ্ঞ",
                      "rules": ""
                    },
                    {
                      "find": "gh",
                      "replace": "ঘ",
                      "rules": ""
                    },
                    {
                      "find": "Gh",
                      "replace": "ঘ",
                      "rules": ""
                    },
                    {
                      "find": "g",
                      "replace": "গ",
                      "rules": ""
                    },
                    {
                      "find": "G",
                      "replace": "গ",
                      "rules": ""
                    },
                    {
                      "find": "hN",
                      "replace": "হ্ণ",
                      "rules": ""
                    },
                    {
                      "find": "hn",
                      "replace": "হ্ন",
                      "rules": ""
                    },
                    {
                      "find": "hm",
                      "replace": "হ্ম",
                      "rules": ""
                    },
                    {
                      "find": "hl",
                      "replace": "হ্ল",
                      "rules": ""
                    },
                    {
                      "find": "h",
                      "replace": "হ",
                      "rules": ""
                    },
                    {
                      "find": "jjh",
                      "replace": "জ্ঝ",
                      "rules": ""
                    },
                    {
                      "find": "jNG",
                      "replace": "জ্ঞ",
                      "rules": ""
                    },
                    {
                      "find": "jh",
                      "replace": "ঝ",
                      "rules": ""
                    },
                    {
                      "find": "jj",
                      "replace": "জ্জ",
                      "rules": ""
                    },
                    {
                      "find": "j",
                      "replace": "জ",
                      "rules": ""
                    },
                    {
                      "find": "J",
                      "replace": "জ",
                      "rules": ""
                    },
                    {
                      "find": "kkhN",
                      "replace": "ক্ষ্ণ",
                      "rules": ""
                    },
                    {
                      "find": "kShN",
                      "replace": "ক্ষ্ণ",
                      "rules": ""
                    },
                    {
                      "find": "kkhm",
                      "replace": "ক্ষ্ম",
                      "rules": ""
                    },
                    {
                      "find": "kShm",
                      "replace": "ক্ষ্ম",
                      "rules": ""
                    },
                    {
                      "find": "kxN",
                      "replace": "ক্ষ্ণ",
                      "rules": ""
                    },
                    {
                      "find": "kxm",
                      "replace": "ক্ষ্ম",
                      "rules": ""
                    },
                    {
                      "find": "kkh",
                      "replace": "ক্ষ",
                      "rules": ""
                    },
                    {
                      "find": "kSh",
                      "replace": "ক্ষ",
                      "rules": ""
                    },
                    {
                      "find": "ksh",
                      "replace": "কশ",
                      "rules": ""
                    },
                    {
                      "find": "kx",
                      "replace": "ক্ষ",
                      "rules": ""
                    },
                    {
                      "find": "kk",
                      "replace": "ক্ক",
                      "rules": ""
                    },
                    {
                      "find": "kT",
                      "replace": "ক্ট",
                      "rules": ""
                    },
                    {
                      "find": "kt",
                      "replace": "ক্ত",
                      "rules": ""
                    },
                    {
                      "find": "kl",
                      "replace": "ক্ল",
                      "rules": ""
                    },
                    {
                      "find": "ks",
                      "replace": "ক্স",
                      "rules": ""
                    },
                    {
                      "find": "kh",
                      "replace": "খ",
                      "rules": ""
                    },
                    {
                      "find": "k",
                      "replace": "ক",
                      "rules": ""
                    },
                    {
                      "find": "lbh",
                      "replace": "ল্ভ",
                      "rules": ""
                    },
                    {
                      "find": "ldh",
                      "replace": "ল্ধ",
                      "rules": ""
                    },
                    {
                      "find": "lkh",
                      "replace": "লখ",
                      "rules": ""
                    },
                    {
                      "find": "lgh",
                      "replace": "লঘ",
                      "rules": ""
                    },
                    {
                      "find": "lph",
                      "replace": "লফ",
                      "rules": ""
                    },
                    {
                      "find": "lk",
                      "replace": "ল্ক",
                      "rules": ""
                    },
                    {
                      "find": "lg",
                      "replace": "ল্গ",
                      "rules": ""
                    },
                    {
                      "find": "lT",
                      "replace": "ল্ট",
                      "rules": ""
                    },
                    {
                      "find": "lD",
                      "replace": "ল্ড",
                      "rules": ""
                    },
                    {
                      "find": "lp",
                      "replace": "ল্প",
                      "rules": ""
                    },
                    {
                      "find": "lv",
                      "replace": "ল্ভ",
                      "rules": ""
                    },
                    {
                      "find": "lm",
                      "replace": "ল্ম",
                      "rules": ""
                    },
                    {
                      "find": "ll",
                      "replace": "ল্ল",
                      "rules": ""
                    },
                    {
                      "find": "lb",
                      "replace": "ল্ব",
                      "rules": ""
                    },
                    {
                      "find": "l",
                      "replace": "ল",
                      "rules": ""
                    },
                    {
                      "find": "mth",
                      "replace": "ম্থ",
                      "rules": ""
                    },
                    {
                      "find": "mph",
                      "replace": "ম্ফ",
                      "rules": ""
                    },
                    {
                      "find": "mbh",
                      "replace": "ম্ভ",
                      "rules": ""
                    },
                    {
                      "find": "mpl",
                      "replace": "মপ্ল",
                      "rules": ""
                    },
                    {
                      "find": "mn",
                      "replace": "ম্ন",
                      "rules": ""
                    },
                    {
                      "find": "mp",
                      "replace": "ম্প",
                      "rules": ""
                    },
                    {
                      "find": "mv",
                      "replace": "ম্ভ",
                      "rules": ""
                    },
                    {
                      "find": "mm",
                      "replace": "ম্ম",
                      "rules": ""
                    },
                    {
                      "find": "ml",
                      "replace": "ম্ল",
                      "rules": ""
                    },
                    {
                      "find": "mb",
                      "replace": "ম্ব",
                      "rules": ""
                    },
                    {
                      "find": "mf",
                      "replace": "ম্ফ",
                      "rules": ""
                    },
                    {
                      "find": "m",
                      "replace": "ম",
                      "rules": ""
                    },
                    {
                      "find": 0,
                      "replace": "০",
                      "rules": ""
                    },
                    {
                      "find": 1,
                      "replace": "১",
                      "rules": ""
                    },
                    {
                      "find": 2,
                      "replace": "২",
                      "rules": ""
                    },
                    {
                      "find": 3,
                      "replace": "৩",
                      "rules": ""
                    },
                    {
                      "find": 4,
                      "replace": "৪",
                      "rules": ""
                    },
                    {
                      "find": 5,
                      "replace": "৫",
                      "rules": ""
                    },
                    {
                      "find": 6,
                      "replace": "৬",
                      "rules": ""
                    },
                    {
                      "find": 7,
                      "replace": "৭",
                      "rules": ""
                    },
                    {
                      "find": 8,
                      "replace": "৮",
                      "rules": ""
                    },
                    {
                      "find": 9,
                      "replace": "৯",
                      "rules": ""
                    },
                    {
                      "find": "NgkSh",
                      "replace": "ঙ্ক্ষ",
                      "rules": ""
                    },
                    {
                      "find": "Ngkkh",
                      "replace": "ঙ্ক্ষ",
                      "rules": ""
                    },
                    {
                      "find": "NGch",
                      "replace": "ঞ্ছ",
                      "rules": ""
                    },
                    {
                      "find": "Nggh",
                      "replace": "ঙ্ঘ",
                      "rules": ""
                    },
                    {
                      "find": "Ngkh",
                      "replace": "ঙ্খ",
                      "rules": ""
                    },
                    {
                      "find": "NGjh",
                      "replace": "ঞ্ঝ",
                      "rules": ""
                    },
                    {
                      "find": "ngOU",
                      "replace": "ঙ্গৌ",
                      "rules": ""
                    },
                    {
                      "find": "ngOI",
                      "replace": "ঙ্গৈ",
                      "rules": ""
                    },
                    {
                      "find": "Ngkx",
                      "replace": "ঙ্ক্ষ",
                      "rules": ""
                    },
                    {
                      "find": "NGc",
                      "replace": "ঞ্চ",
                      "rules": ""
                    },
                    {
                      "find": "nch",
                      "replace": "ঞ্ছ",
                      "rules": ""
                    },
                    {
                      "find": "njh",
                      "replace": "ঞ্ঝ",
                      "rules": ""
                    },
                    {
                      "find": "ngh",
                      "replace": "ঙ্ঘ",
                      "rules": ""
                    },
                    {
                      "find": "Ngk",
                      "replace": "ঙ্ক",
                      "rules": ""
                    },
                    {
                      "find": "Ngx",
                      "replace": "ঙ্ষ",
                      "rules": ""
                    },
                    {
                      "find": "Ngg",
                      "replace": "ঙ্গ",
                      "rules": ""
                    },
                    {
                      "find": "Ngm",
                      "replace": "ঙ্ম",
                      "rules": ""
                    },
                    {
                      "find": "NGj",
                      "replace": "ঞ্জ",
                      "rules": ""
                    },
                    {
                      "find": "ndh",
                      "replace": "ন্ধ",
                      "rules": ""
                    },
                    {
                      "find": "nTh",
                      "replace": "ন্ঠ",
                      "rules": ""
                    },
                    {
                      "find": "NTh",
                      "replace": "ণ্ঠ",
                      "rules": ""
                    },
                    {
                      "find": "nth",
                      "replace": "ন্থ",
                      "rules": ""
                    },
                    {
                      "find": "nkh",
                      "replace": "ঙ্খ",
                      "rules": ""
                    },
                    {
                      "find": "ngo",
                      "replace": "ঙ্গ",
                      "rules": ""
                    },
                    {
                      "find": "nga",
                      "replace": "ঙ্গা",
                      "rules": ""
                    },
                    {
                      "find": "ngi",
                      "replace": "ঙ্গি",
                      "rules": ""
                    },
                    {
                      "find": "ngI",
                      "replace": "ঙ্গী",
                      "rules": ""
                    },
                    {
                      "find": "ngu",
                      "replace": "ঙ্গু",
                      "rules": ""
                    },
                    {
                      "find": "ngU",
                      "replace": "ঙ্গূ",
                      "rules": ""
                    },
                    {
                      "find": "nge",
                      "replace": "ঙ্গে",
                      "rules": ""
                    },
                    {
                      "find": "ngO",
                      "replace": "ঙ্গো",
                      "rules": ""
                    },
                    {
                      "find": "NDh",
                      "replace": "ণ্ঢ",
                      "rules": ""
                    },
                    {
                      "find": "nsh",
                      "replace": "নশ",
                      "rules": ""
                    },
                    {
                      "find": "Ngr",
                      "replace": "ঙর",
                      "rules": ""
                    },
                    {
                      "find": "NGr",
                      "replace": "ঞর",
                      "rules": ""
                    },
                    {
                      "find": "ngr",
                      "replace": "ংর",
                      "rules": ""
                    },
                    {
                      "find": "nj",
                      "replace": "ঞ্জ",
                      "rules": ""
                    },
                    {
                      "find": "Ng",
                      "replace": "ঙ",
                      "rules": ""
                    },
                    {
                      "find": "NG",
                      "replace": "ঞ",
                      "rules": ""
                    },
                    {
                      "find": "nk",
                      "replace": "ঙ্ক",
                      "rules": ""
                    },
                    {
                      "find": "ng",
                      "replace": "ং",
                      "rules": ""
                    },
                    {
                      "find": "nn",
                      "replace": "ন্ন",
                      "rules": ""
                    },
                    {
                      "find": "NN",
                      "replace": "ণ্ণ",
                      "rules": ""
                    },
                    {
                      "find": "Nn",
                      "replace": "ণ্ন",
                      "rules": ""
                    },
                    {
                      "find": "nm",
                      "replace": "ন্ম",
                      "rules": ""
                    },
                    {
                      "find": "Nm",
                      "replace": "ণ্ম",
                      "rules": ""
                    },
                    {
                      "find": "nd",
                      "replace": "ন্দ",
                      "rules": ""
                    },
                    {
                      "find": "nT",
                      "replace": "ন্ট",
                      "rules": ""
                    },
                    {
                      "find": "NT",
                      "replace": "ণ্ট",
                      "rules": ""
                    },
                    {
                      "find": "nD",
                      "replace": "ন্ড",
                      "rules": ""
                    },
                    {
                      "find": "ND",
                      "replace": "ণ্ড",
                      "rules": ""
                    },
                    {
                      "find": "nt",
                      "replace": "ন্ত",
                      "rules": ""
                    },
                    {
                      "find": "ns",
                      "replace": "ন্স",
                      "rules": ""
                    },
                    {
                      "find": "nc",
                      "replace": "ঞ্চ",
                      "rules": ""
                    },
                    {
                      "find": "n",
                      "replace": "ন",
                      "rules": ""
                    },
                    {
                      "find": "N",
                      "replace": "ণ",
                      "rules": ""
                    },
                    {
                      "find": "OI`",
                      "replace": "ৈ",
                      "rules": ""
                    },
                    {
                      "find": "OU`",
                      "replace": "ৌ",
                      "rules": ""
                    },
                    {
                      "find": "O`",
                      "replace": "ো",
                      "rules": ""
                    },
                    {
                      "find": "OI",
                      "replace": "ৈ",
                      "rules": {
                        "rule": [
                          {
                            "find": {
                              "match": ""
                            },
                            "replace": "ঐ"
                          },
                          {
                            "find": {
                              "match": ""
                            },
                            "replace": "ঐ"
                          }
                        ]
                      }
                    },
                    {
                      "find": "OU",
                      "replace": "ৌ",
                      "rules": {
                        "rule": [
                          {
                            "find": {
                              "match": ""
                            },
                            "replace": "ঔ"
                          },
                          {
                            "find": {
                              "match": ""
                            },
                            "replace": "ঔ"
                          }
                        ]
                      }
                    },
                    {
                      "find": "O",
                      "replace": "ো",
                      "rules": {
                        "rule": [
                          {
                            "find": {
                              "match": ""
                            },
                            "replace": "ও"
                          },
                          {
                            "find": {
                              "match": ""
                            },
                            "replace": "ও"
                          }
                        ]
                      }
                    },
                    {
                      "find": "phl",
                      "replace": "ফ্ল",
                      "rules": ""
                    },
                    {
                      "find": "pT",
                      "replace": "প্ট",
                      "rules": ""
                    },
                    {
                      "find": "pt",
                      "replace": "প্ত",
                      "rules": ""
                    },
                    {
                      "find": "pn",
                      "replace": "প্ন",
                      "rules": ""
                    },
                    {
                      "find": "pp",
                      "replace": "প্প",
                      "rules": ""
                    },
                    {
                      "find": "pl",
                      "replace": "প্ল",
                      "rules": ""
                    },
                    {
                      "find": "ps",
                      "replace": "প্স",
                      "rules": ""
                    },
                    {
                      "find": "ph",
                      "replace": "ফ",
                      "rules": ""
                    },
                    {
                      "find": "fl",
                      "replace": "ফ্ল",
                      "rules": ""
                    },
                    {
                      "find": "f",
                      "replace": "ফ",
                      "rules": ""
                    },
                    {
                      "find": "p",
                      "replace": "প",
                      "rules": ""
                    },
                    {
                      "find": "rri`",
                      "replace": "ৃ",
                      "rules": ""
                    },
                    {
                      "find": "rri",
                      "replace": "ৃ",
                      "rules": {
                        "rule": [
                          {
                            "find": {
                              "match": ""
                            },
                            "replace": "ঋ"
                          },
                          {
                            "find": {
                              "match": ""
                            },
                            "replace": "ঋ"
                          }
                        ]
                      }
                    },
                    {
                      "find": "rrZ",
                      "replace": "রর‍্য",
                      "rules": ""
                    },
                    {
                      "find": "rry",
                      "replace": "রর‍্য",
                      "rules": ""
                    },
                    {
                      "find": "rZ",
                      "replace": "র‍্য",
                      "rules": {
                        "rule": {
                          "find": {
                            "match": [
                              "",
                              "r",
                              "y",
                              "w",
                              "x"
                            ]
                          },
                          "replace": "্র্য"
                        }
                      }
                    },
                    {
                      "find": "ry",
                      "replace": "র‍্য",
                      "rules": {
                        "rule": {
                          "find": {
                            "match": [
                              "",
                              "r",
                              "y",
                              "w",
                              "x"
                            ]
                          },
                          "replace": "্র্য"
                        }
                      }
                    },
                    {
                      "find": "rr",
                      "replace": "রর",
                      "rules": {
                        "rule": [
                          {
                            "find": {
                              "match": [
                                "",
                                "",
                                "r",
                                ""
                              ]
                            },
                            "replace": "র্"
                          },
                          {
                            "find": {
                              "match": [
                                "",
                                "r"
                              ]
                            },
                            "replace": "্রর"
                          }
                        ]
                      }
                    },
                    {
                      "find": "Rg",
                      "replace": "ড়্গ",
                      "rules": ""
                    },
                    {
                      "find": "Rh",
                      "replace": "ঢ়",
                      "rules": ""
                    },
                    {
                      "find": "R",
                      "replace": "ড়",
                      "rules": ""
                    },
                    {
                      "find": "r",
                      "replace": "র",
                      "rules": {
                        "rule": {
                          "find": {
                            "match": [
                              "",
                              "r",
                              "y",
                              "w",
                              "x",
                              "Z"
                            ]
                          },
                          "replace": "্র"
                        }
                      }
                    },
                    {
                      "find": "shch",
                      "replace": "শ্ছ",
                      "rules": ""
                    },
                    {
                      "find": "ShTh",
                      "replace": "ষ্ঠ",
                      "rules": ""
                    },
                    {
                      "find": "Shph",
                      "replace": "ষ্ফ",
                      "rules": ""
                    },
                    {
                      "find": "Sch",
                      "replace": "শ্ছ",
                      "rules": ""
                    },
                    {
                      "find": "skl",
                      "replace": "স্ক্ল",
                      "rules": ""
                    },
                    {
                      "find": "skh",
                      "replace": "স্খ",
                      "rules": ""
                    },
                    {
                      "find": "sth",
                      "replace": "স্থ",
                      "rules": ""
                    },
                    {
                      "find": "sph",
                      "replace": "স্ফ",
                      "rules": ""
                    },
                    {
                      "find": "shc",
                      "replace": "শ্চ",
                      "rules": ""
                    },
                    {
                      "find": "sht",
                      "replace": "শ্ত",
                      "rules": ""
                    },
                    {
                      "find": "shn",
                      "replace": "শ্ন",
                      "rules": ""
                    },
                    {
                      "find": "shm",
                      "replace": "শ্ম",
                      "rules": ""
                    },
                    {
                      "find": "shl",
                      "replace": "শ্ল",
                      "rules": ""
                    },
                    {
                      "find": "Shk",
                      "replace": "ষ্ক",
                      "rules": ""
                    },
                    {
                      "find": "ShT",
                      "replace": "ষ্ট",
                      "rules": ""
                    },
                    {
                      "find": "ShN",
                      "replace": "ষ্ণ",
                      "rules": ""
                    },
                    {
                      "find": "Shp",
                      "replace": "ষ্প",
                      "rules": ""
                    },
                    {
                      "find": "Shf",
                      "replace": "ষ্ফ",
                      "rules": ""
                    },
                    {
                      "find": "Shm",
                      "replace": "ষ্ম",
                      "rules": ""
                    },
                    {
                      "find": "spl",
                      "replace": "স্প্ল",
                      "rules": ""
                    },
                    {
                      "find": "sk",
                      "replace": "স্ক",
                      "rules": ""
                    },
                    {
                      "find": "Sc",
                      "replace": "শ্চ",
                      "rules": ""
                    },
                    {
                      "find": "sT",
                      "replace": "স্ট",
                      "rules": ""
                    },
                    {
                      "find": "st",
                      "replace": "স্ত",
                      "rules": ""
                    },
                    {
                      "find": "sn",
                      "replace": "স্ন",
                      "rules": ""
                    },
                    {
                      "find": "sp",
                      "replace": "স্প",
                      "rules": ""
                    },
                    {
                      "find": "sf",
                      "replace": "স্ফ",
                      "rules": ""
                    },
                    {
                      "find": "sm",
                      "replace": "স্ম",
                      "rules": ""
                    },
                    {
                      "find": "sl",
                      "replace": "স্ল",
                      "rules": ""
                    },
                    {
                      "find": "sh",
                      "replace": "শ",
                      "rules": ""
                    },
                    {
                      "find": "Sc",
                      "replace": "শ্চ",
                      "rules": ""
                    },
                    {
                      "find": "St",
                      "replace": "শ্ত",
                      "rules": ""
                    },
                    {
                      "find": "Sn",
                      "replace": "শ্ন",
                      "rules": ""
                    },
                    {
                      "find": "Sm",
                      "replace": "শ্ম",
                      "rules": ""
                    },
                    {
                      "find": "Sl",
                      "replace": "শ্ল",
                      "rules": ""
                    },
                    {
                      "find": "Sh",
                      "replace": "ষ",
                      "rules": ""
                    },
                    {
                      "find": "s",
                      "replace": "স",
                      "rules": ""
                    },
                    {
                      "find": "S",
                      "replace": "শ",
                      "rules": ""
                    },
                    {
                      "find": "oo`",
                      "replace": "ু",
                      "rules": ""
                    },
                    {
                      "find": "oo",
                      "replace": "ু",
                      "rules": {
                        "rule": [
                          {
                            "find": {
                              "match": [
                                "",
                                "`"
                              ]
                            },
                            "replace": "উ"
                          },
                          {
                            "find": {
                              "match": [
                                "",
                                "`"
                              ]
                            },
                            "replace": "উ"
                          }
                        ]
                      }
                    },
                    {
                      "find": "o`",
                      "replace": "",
                      "rules": ""
                    },
                    {
                      "find": "oZ",
                      "replace": "অ্য",
                      "rules": ""
                    },
                    {
                      "find": "o",
                      "replace": "",
                      "rules": {
                        "rule": [
                          {
                            "find": {
                              "match": [
                                "",
                                "o"
                              ]
                            },
                            "replace": "ও"
                          },
                          {
                            "find": {
                              "match": [
                                "",
                                "o"
                              ]
                            },
                            "replace": "অ"
                          },
                          {
                            "find": {
                              "match": ""
                            },
                            "replace": "অ"
                          }
                        ]
                      }
                    },
                    {
                      "find": "tth",
                      "replace": "ত্থ",
                      "rules": ""
                    },
                    {
                      "find": "t``",
                      "replace": "ৎ",
                      "rules": ""
                    },
                    {
                      "find": "TT",
                      "replace": "ট্ট",
                      "rules": ""
                    },
                    {
                      "find": "Tm",
                      "replace": "ট্ম",
                      "rules": ""
                    },
                    {
                      "find": "Th",
                      "replace": "ঠ",
                      "rules": ""
                    },
                    {
                      "find": "tn",
                      "replace": "ত্ন",
                      "rules": ""
                    },
                    {
                      "find": "tm",
                      "replace": "ত্ম",
                      "rules": ""
                    },
                    {
                      "find": "th",
                      "replace": "থ",
                      "rules": ""
                    },
                    {
                      "find": "tt",
                      "replace": "ত্ত",
                      "rules": ""
                    },
                    {
                      "find": "T",
                      "replace": "ট",
                      "rules": ""
                    },
                    {
                      "find": "t",
                      "replace": "ত",
                      "rules": ""
                    },
                    {
                      "find": "aZ",
                      "replace": "অ্যা",
                      "rules": ""
                    },
                    {
                      "find": "AZ",
                      "replace": "অ্যা",
                      "rules": ""
                    },
                    {
                      "find": "a`",
                      "replace": "া",
                      "rules": ""
                    },
                    {
                      "find": "A`",
                      "replace": "া",
                      "rules": ""
                    },
                    {
                      "find": "a",
                      "replace": "া",
                      "rules": {
                        "rule": [
                          {
                            "find": {
                              "match": [
                                "",
                                "`"
                              ]
                            },
                            "replace": "আ"
                          },
                          {
                            "find": {
                              "match": [
                                "",
                                "a",
                                "`"
                              ]
                            },
                            "replace": "য়া"
                          },
                          {
                            "find": {
                              "match": [
                                "a",
                                "`"
                              ]
                            },
                            "replace": "আ"
                          }
                        ]
                      }
                    },
                    {
                      "find": "i`",
                      "replace": "ি",
                      "rules": ""
                    },
                    {
                      "find": "i",
                      "replace": "ি",
                      "rules": {
                        "rule": [
                          {
                            "find": {
                              "match": [
                                "",
                                "`"
                              ]
                            },
                            "replace": "ই"
                          },
                          {
                            "find": {
                              "match": [
                                "",
                                "`"
                              ]
                            },
                            "replace": "ই"
                          }
                        ]
                      }
                    },
                    {
                      "find": "I`",
                      "replace": "ী",
                      "rules": ""
                    },
                    {
                      "find": "I",
                      "replace": "ী",
                      "rules": {
                        "rule": [
                          {
                            "find": {
                              "match": [
                                "",
                                "`"
                              ]
                            },
                            "replace": "ঈ"
                          },
                          {
                            "find": {
                              "match": [
                                "",
                                "`"
                              ]
                            },
                            "replace": "ঈ"
                          }
                        ]
                      }
                    },
                    {
                      "find": "u`",
                      "replace": "ু",
                      "rules": ""
                    },
                    {
                      "find": "u",
                      "replace": "ু",
                      "rules": {
                        "rule": [
                          {
                            "find": {
                              "match": [
                                "",
                                "`"
                              ]
                            },
                            "replace": "উ"
                          },
                          {
                            "find": {
                              "match": [
                                "",
                                "`"
                              ]
                            },
                            "replace": "উ"
                          }
                        ]
                      }
                    },
                    {
                      "find": "U`",
                      "replace": "ূ",
                      "rules": ""
                    },
                    {
                      "find": "U",
                      "replace": "ূ",
                      "rules": {
                        "rule": [
                          {
                            "find": {
                              "match": [
                                "",
                                "`"
                              ]
                            },
                            "replace": "ঊ"
                          },
                          {
                            "find": {
                              "match": [
                                "",
                                "`"
                              ]
                            },
                            "replace": "ঊ"
                          }
                        ]
                      }
                    },
                    {
                      "find": "ee`",
                      "replace": "ী",
                      "rules": ""
                    },
                    {
                      "find": "ee",
                      "replace": "ী",
                      "rules": {
                        "rule": [
                          {
                            "find": {
                              "match": [
                                "",
                                "`"
                              ]
                            },
                            "replace": "ঈ"
                          },
                          {
                            "find": {
                              "match": [
                                "",
                                "`"
                              ]
                            },
                            "replace": "ঈ"
                          }
                        ]
                      }
                    },
                    {
                      "find": "e`",
                      "replace": "ে",
                      "rules": ""
                    },
                    {
                      "find": "e",
                      "replace": "ে",
                      "rules": {
                        "rule": [
                          {
                            "find": {
                              "match": [
                                "",
                                "`"
                              ]
                            },
                            "replace": "এ"
                          },
                          {
                            "find": {
                              "match": [
                                "",
                                "`"
                              ]
                            },
                            "replace": "এ"
                          }
                        ]
                      }
                    },
                    {
                      "find": "z",
                      "replace": "য",
                      "rules": ""
                    },
                    {
                      "find": "Z",
                      "replace": "্য",
                      "rules": ""
                    },
                    {
                      "find": "y",
                      "replace": "্য",
                      "rules": {
                        "rule": [
                          {
                            "find": {
                              "match": [
                                "",
                                ""
                              ]
                            },
                            "replace": "য়"
                          },
                          {
                            "find": {
                              "match": ""
                            },
                            "replace": "ইয়"
                          }
                        ]
                      }
                    },
                    {
                      "find": "Y",
                      "replace": "য়",
                      "rules": ""
                    },
                    {
                      "find": "q",
                      "replace": "ক",
                      "rules": ""
                    },
                    {
                      "find": "w",
                      "replace": "ও",
                      "rules": {
                        "rule": [
                          {
                            "find": {
                              "match": [
                                "",
                                ""
                              ]
                            },
                            "replace": "ওয়"
                          },
                          {
                            "find": {
                              "match": ""
                            },
                            "replace": "্ব"
                          }
                        ]
                      }
                    },
                    {
                      "find": "x",
                      "replace": "ক্স",
                      "rules": {
                        "rule": {
                          "find": {
                            "match": ""
                          },
                          "replace": "এক্স"
                        }
                      }
                    },
                    {
                      "find": ":`",
                      "replace": ":",
                      "rules": ""
                    },
                    {
                      "find": ":",
                      "replace": "ঃ",
                      "rules": ""
                    },
                    {
                      "find": "^`",
                      "replace": "^",
                      "rules": ""
                    },
                    {
                      "find": "^",
                      "replace": "ঁ",
                      "rules": ""
                    },
                    {
                      "find": ",,",
                      "replace": "্‌",
                      "rules": ""
                    },
                    {
                      "find": ",",
                      "replace": ",",
                      "rules": ""
                    },
                    {
                      "find": "$",
                      "replace": "৳",
                      "rules": ""
                    },
                    {
                      "find": "`",
                      "replace": "",
                      "rules": ""
                    }
                  ]
                }
              }
            }
            """;
}
