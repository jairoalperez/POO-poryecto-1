PGDMP     6                     x           ZOO    12.1    12.1     �
           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                        0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    24602    ZOO    DATABASE     �   CREATE DATABASE "ZOO" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_United States.1252' LC_CTYPE = 'Spanish_United States.1252';
    DROP DATABASE "ZOO";
                postgres    false            �            1259    24603    animal    TABLE     �   CREATE TABLE public.animal (
    tipo character varying,
    reproduccion character varying,
    alimentacion character varying,
    temperamento character varying,
    habitat character varying,
    cantidad character varying
);
    DROP TABLE public.animal;
       public         heap    postgres    false            �
          0    24603    animal 
   TABLE DATA           c   COPY public.animal (tipo, reproduccion, alimentacion, temperamento, habitat, cantidad) FROM stdin;
    public          postgres    false    202   �       �
   �   x���Mk�0��֯�/(,�`�P��$te�]TG-���ǡ��6��t��&���%痁t��?���6�(��/J],]NJ�֐���:\��GRM�%l�K����oQ��2�{��2؉G��F~���Y�Wi�x�����	���9��AA��_�Z�����(g�i�oPv�Ra���S®�M	iP��Ϡ�N�o���ú��z2�-����L�j��� n6b�     