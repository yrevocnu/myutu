#!/usr/bin/env python3

from sys import argv

import yaml

for fname in argv[1:]:
    with open(fname) as infile:
        try:
            print('---', 'Parsing', fname)
            objects = yaml.load_all(infile)
            for parsed in objects:
                print('SUCCESS!')
                print(parsed)
        except Exception as exc:
            print('Oops!', exc)
