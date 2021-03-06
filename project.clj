(defproject rete "4.3.0-SNAPSHOT"
  :description "Clojure RETE implementation for frames"
  :url "https://github.com/rururu/rete4frames"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :jvm-opts ["-Xmx8000M"]
  :aot :all
  :main rete.core
  :dependencies [[org.clojure/clojure "1.6.0"]])
