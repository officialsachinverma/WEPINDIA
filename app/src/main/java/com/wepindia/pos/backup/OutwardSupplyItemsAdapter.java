package com.wepindia.pos.backup;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wepindia.pos.R;


class OutwardSupplyItemsAdapter extends RecyclerView.Adapter<OutwardSupplyItemsAdapter.OutwardSupplyItemsViewHolder> {

   /* private List<OutwardSupplyItems> mOutwardSupplyItemsList;

    public OutwardSupplyItemsAdapter(List<OutwardSupplyItems> outwardSupplyItemsList) {
        this.mOutwardSupplyItemsList = outwardSupplyItemsList;
    }*/

    @Override
    public OutwardSupplyItemsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.test_adapter, parent, false);

        return new OutwardSupplyItemsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(OutwardSupplyItemsViewHolder holder, int position) {
        //    OutwardSupplyItems movie = mOutwardSupplyItemsList.get(position);

     /*   holder.mItemCode.setText(mOutwardSupplyItemsList.get(position).getItemCode());
        holder.mItemName.setText(mOutwardSupplyItemsList.get(position).getItemName());

        holder.mItemRate1.setText(String.valueOf(mOutwardSupplyItemsList.get(position).getItemRate1()));
        holder.mItemRate2.setText(String.valueOf(mOutwardSupplyItemsList.get(position).getItemRate2()));
        holder.mItemRate3.setText(String.valueOf(mOutwardSupplyItemsList.get(position).getItemRate3()));

        holder.mItemQuantity.setText(String.valueOf(mOutwardSupplyItemsList.get(position).getItemQuanty()));
        holder.mItemUOM.setText(mOutwardSupplyItemsList.get(position).getItemUOM());
        holder.mItemSupplyType.setText(mOutwardSupplyItemsList.get(position).getItemSupplyType());

        holder.mItemCGST.setText(String.valueOf(mOutwardSupplyItemsList.get(position).getItemCGSTRate()));
        holder.mItemSGST.setText(String.valueOf(mOutwardSupplyItemsList.get(position).getItemSGSTRate()));
        holder.mItemIGST.setText(String.valueOf(mOutwardSupplyItemsList.get(position).getItemIGSTRate()));
        holder.mItemCESS.setText(String.valueOf(mOutwardSupplyItemsList.get(position).getItemCESSRate()));

        holder.mItemDiscount.setText(String.valueOf(mOutwardSupplyItemsList.get(position).getItemDiscount()));

        Picasso.with(holder.mItemCESS.getContext())
                .load("")
                .placeholder(R.drawable.img_noimage) //this is optional the image to display while the url image is downloading
                .error(R.drawable.img_noimage)         //this is also optional if some error has occurred in downloading the image this image would be displayed
                .into(holder.mItemImageURL);
*/
    }

    @Override
    public int getItemCount() {
      //  return mOutwardSupplyItemsList.size();

        return 0;
    }

    class OutwardSupplyItemsViewHolder extends RecyclerView.ViewHolder {
        private TextView mItemCode;
        private TextView mItemName;
        private TextView mItemRate1;
        private TextView mItemRate2;
        private TextView mItemRate3;

        private TextView mItemQuantity;
        private TextView mItemUOM;
        private TextView mItemSupplyType;

        private TextView mItemCGST;
        private TextView mItemSGST;
        private TextView mItemIGST;
        private TextView mItemCESS;

        private TextView mItemDiscount;
        private ImageView mItemImageURL;

        OutwardSupplyItemsViewHolder(View view) {
            super(view);
            mItemCode = (TextView) view.findViewById(R.id.tv_item_code);
            mItemName = (TextView) view.findViewById(R.id.tv_item_name);
            mItemRate1 = (TextView) view.findViewById(R.id.tv_item_rate_1);
            mItemRate2 = (TextView) view.findViewById(R.id.tv_item_rate_2);
            mItemRate3 = (TextView) view.findViewById(R.id.tv_item_rate_3);

            mItemQuantity = (TextView) view.findViewById(R.id.tv_item_quantity);
            mItemUOM = (TextView) view.findViewById(R.id.tv_item_uom);
            mItemSupplyType = (TextView) view.findViewById(R.id.tv_item_supply_type);

            mItemCGST = (TextView) view.findViewById(R.id.tv_item_cgst);
            mItemSGST = (TextView) view.findViewById(R.id.tv_item_sgst);
            mItemIGST = (TextView) view.findViewById(R.id.tv_item_igst);
            mItemCESS = (TextView) view.findViewById(R.id.tv_item_cess);

            mItemDiscount = (TextView) view.findViewById(R.id.tv_item_discount);
            mItemImageURL = (ImageView) view.findViewById(R.id.iv_icon);
        }
    }
}
