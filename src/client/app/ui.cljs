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
      (dom/div nil label))))

(def ui-child (om/factory Child))

(defui ^:once Root
  static om/IQuery
  (query [this] [:ui/react-key :value])
  Object
  (render [this]
    (let [{:keys [ui/react-key value]} (om/props this)]
      (dom/div #js {:key react-key}
               (dom/input #js {:type "text" :value value})
               (dom/button #js {:onClick (fn [evt] (om/transact! this '[(set-to-tony)]))} "Set to Tony")
               (ui-child {:label "His Label"})))))

(comment
  (+ 1 2 3 4)

  (def a 3)

  (filter even? [1 2 3])

  (def m {:a 5
          :b 9
          :c -5
          :d 66
          :e 72
          })

  (def s #{1 2 3})

  (reduce (fn [acc ele] (+ acc (get m ele))) 1 [:a :b :c :d :e])

  (* 9 8 7)
  )
