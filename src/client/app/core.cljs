(ns app.core
  (:require
    app.mutations
    [untangled.client.core :as uc]
    [untangled.i18n :refer-macros [tr trf]]))

(defonce app (atom (uc/new-untangled-client)))

