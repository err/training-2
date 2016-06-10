(ns app.sample-spec
  (:require [untangled-spec.core :refer-macros [specification behavior assertions]]))

(specification "My Thing"
  (behavior "Should work"
    (assertions
      "does math ok"
      (+ 1 1) => 2)))

(specification "Other thing"
  (behavior "should do blah"
    (assertions
      (+ 1 1) => 2)))
