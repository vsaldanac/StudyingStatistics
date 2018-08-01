package cl.vero.studyingstatistics.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cl.vero.studyingstatistics.R;
import cl.vero.studyingstatistics.models.StatisticalConcept;

public class StatisticalConceptAdapter extends RecyclerView.Adapter<StatisticalConceptAdapter.ViewHolder>{

    List<StatisticalConcept> statisticalConcepts = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_statistical_concept,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        StatisticalConcept statisticalConcept = statisticalConcepts.get(i);
        viewHolder.nameConcept.setText(statisticalConcept.getName());
        viewHolder.gradeConcept.setImageResource(statisticalConcept.getGrade());

    }

    @Override
    public int getItemCount() {
        return statisticalConcepts.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView nameTitle, gradeTitle, nameConcept;
        private ImageView gradeConcept;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTitle = itemView.findViewById(R.id.nameTitleTv);
            gradeTitle = itemView.findViewById(R.id.gradeTitleTv);
            nameConcept = itemView.findViewById(R.id.nameConceptTv);
            gradeConcept = itemView.findViewById(R.id.gradeConceptIv);
        }
    }
}
