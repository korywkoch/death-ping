# ping-death

Heroku worker process to wake up your lazy servers.

## Dependencies:

- At-At (https://github.com/overtone/at-at)
- tools.logging (https://github.com/clojure/tools.logging)
- Logback (http://logback.qos.ch/)

## Usage

To run locally:

    $ lein run -m ping-death.core [urls]

To run on Heroku, follow this:

https://devcenter.heroku.com/articles/getting-started-with-clojure#local-workstation-setup


## License

    Copyright © 2017 koryko.ch

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
