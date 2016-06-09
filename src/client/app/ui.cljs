(ns app.ui
  (:require [om.dom :as dom]
            [om.next :as om :refer-macros [defui]]
            [untangled.i18n :refer-macros [tr trf]]
            yahoo.intl-messageformat-with-locales
            [untangled.client.data-fetch :as df]))

(defui ^:once Child
  Object
  (render [this]
    (let [{:keys [label]} (om/props this)]
      (dom/p nil label))))

(def ui-child (om/factory Child))

(defui ^:once Root
  Object
  (render [this]
    (dom/div #js {} (ui-child {:label "My Label"}))))

(comment
  (+ 1 2 3 4)
  )
